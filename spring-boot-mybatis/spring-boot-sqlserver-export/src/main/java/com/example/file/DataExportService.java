package com.example.file;

import com.example.model.Example;
import com.example.util.FileUtil;
import com.example.util.SpringContextUtil;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.zip.GZIPOutputStream;

@Service
public class DataExportService {

    final Logger logger = LoggerFactory.getLogger(DataExportService.class);
    final String MAPPER = "Mapper";
    static String GZ_FILE = "gz";
    @Value("${fileDir}")
    private String fileDir;

    public void WriteDataFileByTableName(String tableName) {
        String upperTableName = tableName.substring(0, 1).toUpperCase() + tableName.substring(1);
        try {
            File file = createFile(upperTableName);
            List list = getDataList(tableName);
            FileUtils.writeLines(file, FileUtil.CHARACTER_SET, list, "");
            writeControlFileByTable(upperTableName, file, Integer.toUnsignedLong(list.size()));
            generateGZFile(file);
//            if (!file.delete())
//                throw new FileExportException("数据文件删除异常");
        } catch (IOException e) {
            logger.error("数据导出失败", e);
            throw new FileExportException("数据导出失败");
        } catch (FileExportException e) {
            throw e;
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

    private List getDataList(String tableName) {
        Object object = SpringContextUtil.getBean(tableName + MAPPER);
        Method method = ReflectionUtils.findMethod(object.getClass(), "selectByExample", Example.class);
        List list;
        try {
            list = (List) method.invoke(object, new Example());
        } catch (IllegalAccessException | InvocationTargetException e) {
            logger.error("方法没找到", e);
            throw new FileExportException("程序异常");
        }
        return list;
    }

    private void writeControlFileByTable(String tableName, File dataFile, Long total) {
        File controlFile = new File(fileDir + File.separator + FileUtil.getControlFileName(tableName));
        String line = tableName + FileUtil.SEPARATOR_TAB + dataFile.length() + FileUtil.SEPARATOR_TAB + total;
        try {
            FileUtils.writeStringToFile(controlFile, line, FileUtil.CHARACTER_SET);
        } catch (IOException e) {
            logger.error("控制文件写入失败", e);
            throw new FileExportException("控制文件写入失败");
        }
    }

    private void generateGZFile(File file) {
        File gzFile = new File(file + FileUtil.FILE_SEPERATOR + GZ_FILE);
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

            }
        }
    }
}
