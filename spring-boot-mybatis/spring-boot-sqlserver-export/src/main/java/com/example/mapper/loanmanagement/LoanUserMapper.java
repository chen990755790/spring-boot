package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.LoanUser;
import com.example.model.LoanUserKey;

import java.util.List;

public interface LoanUserMapper {
    int deleteByPrimaryKey(LoanUserKey key);

    int insert(LoanUser record);

    int insertSelective(LoanUser record);

    List<LoanUser> selectByExample(Example example);

    LoanUser selectByPrimaryKey(LoanUserKey key);

    int updateByPrimaryKeySelective(LoanUser record);

    int updateByPrimaryKey(LoanUser record);
}