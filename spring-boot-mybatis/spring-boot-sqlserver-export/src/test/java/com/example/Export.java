package com.example;

import com.example.file.DataExportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Export {

    @Autowired
    private DataExportService dataExportService;
    @Autowired
    private SimpleJdbcCall simpleJdbcCall;

    @Test
    public void testProc(){

    }
    @Test
    public void testLoan(){
        Long start = System.currentTimeMillis();
        dataExportService.WriteDataFileByTableName("loan");
        System.out.println(System.currentTimeMillis()-start);
    }

}
