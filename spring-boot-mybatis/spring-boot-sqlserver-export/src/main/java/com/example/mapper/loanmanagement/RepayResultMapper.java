package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.RepayResult;
import com.example.model.RepayResultKey;

import java.util.List;

public interface RepayResultMapper {
    int deleteByPrimaryKey(RepayResultKey key);

    int insert(RepayResult record);

    int insertSelective(RepayResult record);

    List<RepayResult> selectByExample(Example example);

    RepayResult selectByPrimaryKey(RepayResultKey key);

    int updateByPrimaryKeySelective(RepayResult record);

    int updateByPrimaryKey(RepayResult record);
}