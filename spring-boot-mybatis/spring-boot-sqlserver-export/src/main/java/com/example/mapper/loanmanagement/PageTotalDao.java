package com.example.mapper.loanmanagement;

import org.apache.ibatis.annotations.Param;

public interface PageTotalDao {

    int selectPageTotal(@Param("tableName") String tableName);
}
