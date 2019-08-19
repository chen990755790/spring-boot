package com.example.mapper.loanmanagement;

import com.example.model.CollateralInsurance;
import com.example.model.Example;

import java.util.List;

public interface CollateralInsuranceMapper {
    int deleteByPrimaryKey(String id);

    int insert(CollateralInsurance record);

    int insertSelective(CollateralInsurance record);

    List<CollateralInsurance> selectByExample(Example example);

    CollateralInsurance selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CollateralInsurance record);

    int updateByPrimaryKey(CollateralInsurance record);
}