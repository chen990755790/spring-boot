package com.example.mapper.loanmanagement;

import com.example.model.Loan;
import com.example.model.Example;
import java.util.List;

public interface LoanMapper {
    int deleteByPrimaryKey(String loanNo);

    int insert(Loan record);

    int insertSelective(Loan record);

    List<Loan> selectByExample(Example example);

    Loan selectByPrimaryKey(String loanNo);

    int updateByPrimaryKeySelective(Loan record);

    int updateByPrimaryKey(Loan record);
}