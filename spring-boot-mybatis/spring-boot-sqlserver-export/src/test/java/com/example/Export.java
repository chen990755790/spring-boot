package com.example;

import com.example.constant.TableConstant;
import com.example.file.DataExportService;
import com.example.file.ftp.Ftp;
import com.example.file.ftp.FtpUtils;
import com.example.task.SchedulerTask;
import com.example.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Export {

    @Autowired
    private DataExportService dataExportService;
    @Autowired
    private SchedulerTask schedulerTask;
    @Autowired
    private Ftp ftp;

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
        dataExportService.WriteDataFileByTableName("loan");
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

}
