package com.example.constant;

public class TableConstant {
    /*
     *  表名首字母必须小写，根据表名规则寻找mapper bean
     * */
    public static final String[] LOANMANAGEMENT_TABLES = {"loan", "collateralBill", "collateralCar", "collateralHouse",
            "collateralHouseRelation", "collateralInsurance", "collateralReceivables", "companyBasic", "loanCommonBorrower",
            "loanCompany", "loanExtension", "loanUser", "loanUserRelationship", "projectBasic", "projectCounterpartyInfo",
            "projectCreditCompany", "projectCreditPerson", "repayPlan", "repayResult"
    };

}
