package com.example.mapper.loanmanagement;

import com.example.model.CollateralHouse;
import com.example.model.Example;

import java.util.List;

public interface CollateralHouseMapper {
    int deleteByPrimaryKey(String id);

    int insert(CollateralHouse record);

    int insertSelective(CollateralHouse record);

    List<CollateralHouse> selectByExample(Example example);

    CollateralHouse selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CollateralHouse record);

    int updateByPrimaryKey(CollateralHouse record);
}