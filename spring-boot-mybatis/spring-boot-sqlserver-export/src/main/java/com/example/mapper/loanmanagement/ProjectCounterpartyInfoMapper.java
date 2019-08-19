package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.ProjectCounterpartyInfo;

import java.util.List;

public interface ProjectCounterpartyInfoMapper {
    int deleteByPrimaryKey(Integer counterpartyId);

    int insert(ProjectCounterpartyInfo record);

    int insertSelective(ProjectCounterpartyInfo record);

    List<ProjectCounterpartyInfo> selectByExample(Example example);

    ProjectCounterpartyInfo selectByPrimaryKey(Integer counterpartyId);

    int updateByPrimaryKeySelective(ProjectCounterpartyInfo record);

    int updateByPrimaryKey(ProjectCounterpartyInfo record);
}