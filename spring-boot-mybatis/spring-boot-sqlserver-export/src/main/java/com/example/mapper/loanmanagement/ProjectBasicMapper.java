package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.ProjectBasic;

import java.util.List;

public interface ProjectBasicMapper {
    int deleteByPrimaryKey(Integer projectId);

    int insert(ProjectBasic record);

    int insertSelective(ProjectBasic record);

    List<ProjectBasic> selectByExample(Example example);

    ProjectBasic selectByPrimaryKey(Integer projectId);

    int updateByPrimaryKeySelective(ProjectBasic record);

    int updateByPrimaryKey(ProjectBasic record);
}