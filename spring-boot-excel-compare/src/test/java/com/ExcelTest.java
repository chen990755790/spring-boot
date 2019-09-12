package com;

import com.example.ExcelUtis;
import com.example.model.Domain;
import com.example.model.Excel;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class ExcelTest {
    Excel excel;

    @Before
    public void before() throws Exception {
        String fileName = "D:\\资产信息.xlsx";
        excel = ExcelUtis.readExcel(fileName);
    }

    @Test
    public void testReadExcel() throws Exception {
        System.out.println(excel);
    }

    @Test
    public void testGetRepeatColumn(){
        Map<String, List<Domain>> repeatColumn = excel.getRepeatColumn();
        System.out.println(repeatColumn);
    }
}
