package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.LoanExtension;
import com.example.model.LoanExtensionKey;

import java.util.List;

public interface LoanExtensionMapper {
    int deleteByPrimaryKey(LoanExtensionKey key);

    int insert(LoanExtension record);

    int insertSelective(LoanExtension record);

    List<LoanExtension> selectByExample(Example example);

    LoanExtension selectByPrimaryKey(LoanExtensionKey key);

    int updateByPrimaryKeySelective(LoanExtension record);

    int updateByPrimaryKey(LoanExtension record);
}