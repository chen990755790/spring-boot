package com.example.mapper.loanmanagement;

import com.example.model.CompanyBasic;
import com.example.model.Example;

import java.util.List;

public interface CompanyBasicMapper {
    int deleteByPrimaryKey(Integer companyId);

    int insert(CompanyBasic record);

    int insertSelective(CompanyBasic record);

    List<CompanyBasic> selectByExample(Example example);

    CompanyBasic selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(CompanyBasic record);

    int updateByPrimaryKey(CompanyBasic record);
}