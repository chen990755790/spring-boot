package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.LoanCommonBorrower;

import java.util.List;

public interface LoanCommonBorrowerMapper {
    int deleteByPrimaryKey(Integer commonBorrowerId);

    int insert(LoanCommonBorrower record);

    int insertSelective(LoanCommonBorrower record);

    List<LoanCommonBorrower> selectByExample(Example example);

    LoanCommonBorrower selectByPrimaryKey(Integer commonBorrowerId);

    int updateByPrimaryKeySelective(LoanCommonBorrower record);

    int updateByPrimaryKey(LoanCommonBorrower record);
}