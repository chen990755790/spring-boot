package com.example.mapper.loanmanagement;

import com.example.model.CollateralBill;
import com.example.model.CollateralBillKey;
import com.example.model.Example;

import java.util.List;

public interface CollateralBillMapper {
    int deleteByPrimaryKey(CollateralBillKey key);

    int insert(CollateralBill record);

    int insertSelective(CollateralBill record);

    List<CollateralBill> selectByExample(Example example);

    CollateralBill selectByPrimaryKey(CollateralBillKey key);

    int updateByPrimaryKeySelective(CollateralBill record);

    int updateByPrimaryKey(CollateralBill record);
}