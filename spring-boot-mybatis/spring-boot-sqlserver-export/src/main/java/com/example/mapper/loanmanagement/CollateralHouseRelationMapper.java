package com.example.mapper.loanmanagement;

import com.example.model.CollateralHouseRelation;
import com.example.model.Example;

import java.util.List;

public interface CollateralHouseRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CollateralHouseRelation record);

    int insertSelective(CollateralHouseRelation record);

    List<CollateralHouseRelation> selectByExample(Example example);

    CollateralHouseRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollateralHouseRelation record);

    int updateByPrimaryKey(CollateralHouseRelation record);
}