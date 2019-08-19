package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.LoanUserRelationship;

import java.util.List;

public interface LoanUserRelationshipMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(LoanUserRelationship record);

    int insertSelective(LoanUserRelationship record);

    List<LoanUserRelationship> selectByExample(Example example);

    LoanUserRelationship selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(LoanUserRelationship record);

    int updateByPrimaryKey(LoanUserRelationship record);
}