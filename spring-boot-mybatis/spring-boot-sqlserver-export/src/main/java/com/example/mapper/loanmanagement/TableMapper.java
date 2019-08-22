package com.example.mapper.loanmanagement;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TableMapper {

    List<Map> selectByTable(@Param("tableName") String tableName);

}
