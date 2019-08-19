package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.ProjectCreditPerson;

import java.util.List;

public interface ProjectCreditPersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProjectCreditPerson record);

    int insertSelective(ProjectCreditPerson record);

    List<ProjectCreditPerson> selectByExample(Example example);

    ProjectCreditPerson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectCreditPerson record);

    int updateByPrimaryKey(ProjectCreditPerson record);
}