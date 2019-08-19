package com.example.mapper.loanmanagement;

import com.example.model.CollateralCar;
import com.example.model.Example;

import java.util.List;

public interface CollateralCarMapper {
    int deleteByPrimaryKey(String id);

    int insert(CollateralCar record);

    int insertSelective(CollateralCar record);

    List<CollateralCar> selectByExample(Example example);

    CollateralCar selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CollateralCar record);

    int updateByPrimaryKey(CollateralCar record);
}