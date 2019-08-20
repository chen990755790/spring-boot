package com.example.constant;

public class TableConstant {
    /*
     *  表名首字母必须小写，根据表名规则寻找mapper bean
     * */
    public static final String[] LOANMANAGEMENT_TABLES = {"Loan", "CollateralBill", "CollateralCar", "CollateralHouse",
            "CollateralHouseRelation", "CollateralInsurance", "CollateralReceivables", "CompanyBasic", "LoanCommonBorrower",
            "LoanCompany", "LoanExtension", "LoanUser", "LoanUserRelationship", "ProjectBasic", "ProjectCounterpartyInfo",
            "ProjectCreditCompany", "ProjectCreditPerson", "RepayPlan", "RepayResult"
    };

}
