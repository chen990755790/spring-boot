package com.example;

import com.example.constant.TableConstant;
import com.example.file.DataExportService;
import com.example.file.ftp.Ftp;
import com.example.file.ftp.FtpUtils;
import com.example.mapper.loanmanagement.LoanMapper;
import com.example.mapper.loanmanagement.TableMapper;
import com.example.model.Example;
import com.example.model.Loan;
import com.example.task.SchedulerTask;
import com.example.util.DateUtil;
import com.example.util.FileUtil;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Export {
    final Semaphore semaphore = new Semaphore(10);
    @Autowired
    private DataExportService dataExportService;
    @Autowired
    private SchedulerTask schedulerTask;
    @Autowired
    private Ftp ftp;
    @Autowired
    private LoanMapper loanMapper;
    @Autowired
    private TableMapper tableMapper;

    @Test
    public void test() throws Exception {
        Long start = System.currentTimeMillis();
        FtpUtils.connectFtp(ftp);
        dataExportService.uploadFile();
        FtpUtils.closeFtp();
        System.out.println((System.currentTimeMillis() - start) + "文件已上传");
    }

    @Test
    public void testExport() {
        for (int i = 0; i < TableConstant.LOANMANAGEMENT_TABLES.length; i++) {
            String tableName = TableConstant.LOANMANAGEMENT_TABLES[i];
            dataExportService.WriteDataFileByTableName(tableName);
            System.out.println(DateUtil.formateDate(new Date(), DateUtil.DATE_TIME_PATTERN) + " " + tableName + " 文件已生成");
        }
    }

    @Test
    public void testLoan() {
        Long start = System.currentTimeMillis();
        dataExportService.WriteDataFileByTableName("Loan");
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void testProcess() {
        try {
            schedulerTask.process();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMap() {
        List<Map> loan = tableMapper.selectByTable("Loan");
        for (int i = 0; i < loan.size(); i++) {
            Map<String, Object> map = loan.get(i);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                System.out.print(entry.getValue() + "\000");
            }
            System.out.println();
        }
    }

    /*
     * 考虑读写速度问题读快，写慢
     * 分配多个线程写入
     * result:多线程写入不影响文件结果
     * */
    @Test
    public void testThread() throws Exception {
        Example example = new Example(1397);
        example.getPage().setPageSize(10000);
        List<Loan> loans = loanMapper.selectByExample(example);
        File file = new File("D:\\loan.txt");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        List subList;

        for (int i = 1; i < 140; i++) {
            semaphore.acquire();
            if (i < 139) {
                subList = loans.subList((i - 1) * 10, i * 10);
            } else {
                subList = loans.subList((i - 1) * 10, 1397);
            }
            new FileWriteThread(file, subList).start();
        }
    }

    final class FileWriteThread extends Thread {
        private File file;
        private List list;

        public FileWriteThread(File file, List list) {
            this.file = file;
            this.list = list;
        }

        @Override
        public void run() {
            try {
                FileUtils.writeLines(file, FileUtil.CHARACTER_SET, list, "", true);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();

            }
        }
    }

}


