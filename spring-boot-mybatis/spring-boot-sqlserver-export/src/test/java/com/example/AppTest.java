package com.example;

import com.example.table.DataColumn;
import com.example.table.DataRow;
import com.example.table.DataTable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("\\001");
    }
    @Test
    public void testMap(){
        Map<String,Object> map = new LinkedHashMap<String, Object>();
        map.put("CompanyId",1);
        map.put("CompanyName","超超超市");
        System.out.println(map);
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list.add(map);
        System.out.println(list);
    }
    @Test
    public void testTable(){
        DataTable dt = new DataTable("cc");
        DataRow dr = new DataRow();
        DataRow dr2 = new DataRow();
        dt.addRow(dr);
        dt.addRow(dr2);
        DataColumn dc1 = new DataColumn("CompanyId");
        DataColumn dc2 = new DataColumn("CompanyName");
        dr.setValue(dc1,1);
        dr.setValue(dc2,"超超1");
        dr2.setValue(dc1,2);
        dr2.setValue(dc2,"超超2");
        System.out.println(dt);
    }
}
