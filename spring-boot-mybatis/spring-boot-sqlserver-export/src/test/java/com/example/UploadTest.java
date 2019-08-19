package com.example;

import com.example.file.DataExportService;
import com.example.file.ftp.Ftp;
import com.example.file.ftp.FtpUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * describe:
 *
 * @author 陈超
 * @date 2019/08/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UploadTest {

    @Autowired
    private DataExportService dataExportService;
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
}
