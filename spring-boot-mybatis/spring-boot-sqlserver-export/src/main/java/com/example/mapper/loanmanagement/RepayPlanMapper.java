package com.example.mapper.loanmanagement;

import com.example.model.Example;
import com.example.model.RepayPlan;
import com.example.model.RepayPlanKey;

import java.util.List;

public interface RepayPlanMapper {
    int deleteByPrimaryKey(RepayPlanKey key);

    int insert(RepayPlan record);

    int insertSelective(RepayPlan record);

    List<RepayPlan> selectByExample(Example example);

    RepayPlan selectByPrimaryKey(RepayPlanKey key);

    int updateByPrimaryKeySelective(RepayPlan record);

    int updateByPrimaryKey(RepayPlan record);
}