package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.LoanCompany;
import com.example.model.LoanCompanyKey;

import java.util.List;

public interface LoanCompanyMapper {
    int deleteByPrimaryKey(LoanCompanyKey key);

    int insert(LoanCompany record);

    int insertSelective(LoanCompany record);

    List<LoanCompany> selectByExample(Example example);

    LoanCompany selectByPrimaryKey(LoanCompanyKey key);

    int updateByPrimaryKeySelective(LoanCompany record);

    int updateByPrimaryKey(LoanCompany record);
}