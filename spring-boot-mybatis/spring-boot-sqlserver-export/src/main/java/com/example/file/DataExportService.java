package com.example.file;

import com.example.file.ftp.FtpUtils;
import com.example.mapper.loanmanagement.PageTotalDao;
import com.example.model.Example;
import com.example.util.DateUtil;
import com.example.util.FileUtil;
import com.example.util.SpringContextUtil;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.zip.GZIPOutputStream;

@Service
public class DataExportService {

    final Logger logger = LoggerFactory.getLogger(DataExportService.class);
    final String MAPPER = "Mapper";

    @Value("${fileDir}")
    private String fileDir;
    @Autowired
    private PageTotalDao pageTotalDao;

    public void WriteDataFileByTableName(String tableName) {
        String lowerTableName = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
        try {
            File file = createFile(tableName);
            int total = pageTotalDao.selectPageTotal(tableName);
            Example example = new Example(total);
            List list;
            int i = 1;
            do {
                example.getPage().setPageNo(i++);
                list = getDataList(lowerTableName, example);
                FileUtils.writeLines(file, FileUtil.CHARACTER_SET, list, "");
            } while (!example.getPage().isLastPage());
            writeControlFileByTable(tableName, file, total);
            generateGZFile(file);
            if (!file.delete()) {
                logger.warn(tableName + "文件删除失败");
            }
        } catch (IOException e) {
            logger.error("数据导出失败", e);
            throw new FileExportException(tableName + "数据导出失败");
        } catch (FileExportException e) {
            throw e;
        } catch (Exception e) {
            logger.error("文件上传异常", e);
            throw new FileExportException(tableName + "文件上传异常");
        }
    }

    private File createFile(String upperTableName) {
        String fileName = FileUtil.getDataFileName(upperTableName);
        File file = new File(fileDir);
        if (!file.exists()) {
            file.mkdirs();
        }
        file = new File(file + File.separator + fileName);
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                logger.error("文件创建失败", e);
                throw new FileExportException("文件创建失败");
            }
        return file;
    }

    private List getDataList(String tableName, Example example) {
        Object object = SpringContextUtil.getBean(tableName + MAPPER);
        Method method = ReflectionUtils.findMethod(object.getClass(), "selectByExample", Example.class);
        List list;
        try {
            list = (List) method.invoke(object, example);
        } catch (IllegalAccessException | InvocationTargetException e) {
            logger.error("方法没找到", e);
            throw new FileExportException("程序异常");
        }
        return list;
    }

    private File writeControlFileByTable(String tableName, File dataFile, int total) {
        File controlFile = new File(fileDir + File.separator + FileUtil.getControlFileName(tableName));
        String line = tableName + FileUtil.SEPARATOR_TAB + dataFile.length() + FileUtil.SEPARATOR_TAB + total;
        try {
            FileUtils.writeStringToFile(controlFile, line, FileUtil.CHARACTER_SET);
        } catch (IOException e) {
            logger.error("控制文件写入失败", e);
            throw new FileExportException("控制文件写入失败");
        }
        return controlFile;
    }

    private File generateGZFile(File file) {
        File gzFile = new File(file + FileUtil.FILE_SEPERATOR + FileUtil.GZ_FILE);
        GZIPOutputStream outputStream = null;
        BufferedInputStream inBuff = null;
        try {
            outputStream = new GZIPOutputStream(new FileOutputStream(gzFile));
            inBuff = new BufferedInputStream(new FileInputStream(file));
            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outputStream.write(b, 0, len);
            }
            return gzFile;
        } catch (IOException e) {
            logger.error("gz文件生成异常", e);
            throw new FileExportException("gz文件生成异常");
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
                if (inBuff != null) {
                    inBuff.close();
                }
            } catch (IOException e) {
                logger.error("流关闭异常", e);
            }
        }
    }

    public void uploadFile() {
        String today = DateUtil.formateDate(new Date());
        try {
            File[] gzfiles = new File(fileDir).listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if (name.contains(today) && name.endsWith(FileUtil.GZ_FILE))
                        return true;
                    return false;
                }
            });
            for (int i = 0; i < gzfiles.length; i++) {
                FtpUtils.upload(gzfiles[i]);
            }
            File[] ctrfiles = new File(fileDir).listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if (name.contains(today) && name.endsWith(FileUtil.SUFFIX_CONTROL_FILE_NAME))
                        return true;
                    return false;
                }
            });
            for (int i = 0; i < ctrfiles.length; i++) {
                FtpUtils.upload(ctrfiles[i]);
            }
        } catch (Exception e) {
            logger.error("文件上传失败", e);
            throw new FileExportException("文件上传失败");
        }
    }
}
