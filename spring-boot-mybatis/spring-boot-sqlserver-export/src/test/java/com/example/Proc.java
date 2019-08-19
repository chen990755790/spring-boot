package com.example;

import com.example.procedure.loanmanagement.LoanManagementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Proc {
    @Autowired
    private LoanManagementService loanManagementService;
    /*
    * 不带参数
    * 返回一张表的数据
    * */
    @Test
    public void testGetCompanyBasic(){
        String proc = "usp_GetCompanyBasicList";
        Object table = loanManagementService.dataTable("",proc,new HashMap<>());
        System.out.println(table);
    }
    /*
    * 带1个参数
    * 返回一条记录
    * */
    @Test
    public void testGetCompanyContact(){
        String proc = "usp_GetCompanyContactById";
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.putIfAbsent("CompanyContactId",36);
        Object table = loanManagementService.dataTable("",proc,objectObjectHashMap);
        System.out.println(table);
    }
    /*
    * 带两个参数
    * 返回多张表
    * */
    @Test
    public void testGetDataSet(){
        String proc = "usp_GetCollateralBill";
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.putIfAbsent("Id","5B4240EC-008D-492E-B4C2-0FD21C185D6A");
        objectObjectHashMap.putIfAbsent("LoanNo","AR000012006201907291023381815446709");
        Object table = loanManagementService.dataSet("",proc,objectObjectHashMap);
        System.out.println(table);
    }
}
