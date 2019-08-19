package com.example.mapper.loanmanagement;

import com.example.model.CollateralReceivables;
import com.example.model.Example;

import java.util.List;

public interface CollateralReceivablesMapper {
    int deleteByPrimaryKey(String id);

    int insert(CollateralReceivables record);

    int insertSelective(CollateralReceivables record);

    List<CollateralReceivables> selectByExample(Example example);

    CollateralReceivables selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CollateralReceivables record);

    int updateByPrimaryKey(CollateralReceivables record);
}