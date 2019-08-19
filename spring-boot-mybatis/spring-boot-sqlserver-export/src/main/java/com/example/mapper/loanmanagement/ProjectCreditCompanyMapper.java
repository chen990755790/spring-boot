package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.ProjectCreditCompany;

import java.util.List;

public interface ProjectCreditCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectCreditCompany record);

    int insertSelective(ProjectCreditCompany record);

    List<ProjectCreditCompany> selectByExample(Example example);

    ProjectCreditCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectCreditCompany record);

    int updateByPrimaryKey(ProjectCreditCompany record);
}