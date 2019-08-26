package com.example.task;

import com.example.constant.TableConstant;
import com.example.file.DataExportService;
import com.example.file.FileExportException;
import com.example.file.ftp.Ftp;
import com.example.file.ftp.FtpUtils;
import com.example.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SchedulerTask {
    @Autowired
    private Ftp ftp;

    final Logger logger = LoggerFactory.getLogger(DataExportService.class);
    @Autowired
    private DataExportService dataExportService;

    @Scheduled(cron = "00 00 16 * * ?")
    public void process() throws FileExportException, Exception {
        for (int i = 0; i < TableConstant.LOANMANAGEMENT_TABLES.length; i++) {
            String tableName = TableConstant.LOANMANAGEMENT_TABLES[i];
            dataExportService.WriteDataFileByTableName(tableName);
            logger.info(DateUtil.formateDate(new Date(), DateUtil.DATE_TIME_PATTERN) + " " + tableName + " 文件已生成");
        }
        Long start = System.currentTimeMillis();
        FtpUtils.connectFtp(ftp);
        dataExportService.uploadFile();
        FtpUtils.closeFtp();
        logger.info(DateUtil.formateDate(new Date(), DateUtil.DATE_TIME_PATTERN) + " 文件已上传");
    }

}
