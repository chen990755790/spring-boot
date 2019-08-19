package com.example.table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class DataColumnCollection {

    private List<DataColumn> columns;

    private HashMap<String, DataColumn> nameMap;

    public DataColumnCollection() {
        columns = new ArrayList<>();
        nameMap = new LinkedHashMap<>();
    }

    public List<DataColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DataColumn> columns) {
        this.columns = columns;
    }

    public boolean add(DataColumn column) {
        nameMap.putIfAbsent(column.getColumnName(), column);
        return columns.add(column);
    }

    public void add(int i, DataColumn column) {
        nameMap.putIfAbsent(column.getColumnName(), column);
        columns.add(i, column);
    }

    public boolean add(Object object) {
        return true;
    }

    public DataColumn get(String columnName) {
        return nameMap.get(columnName);
    }

    public DataColumn get(int i) {
        return columns.get(i);
    }

    public DataColumn addColumn(String columnName, int dataType) {
        DataColumn dataColumn = new DataColumn(columnName, dataType);
        nameMap.putIfAbsent(columnName, dataColumn);
        if (!columns.contains(columnName)) columns.add(dataColumn);
        return dataColumn;
    }

    @Override
    public int hashCode() {
        int dataColumnHash = 0;
        for (DataColumn column : columns) {
            dataColumnHash += column.getColumnName().hashCode();
        }
        return dataColumnHash;
    }

    @Override
    public boolean equals(Object obj) {
        DataColumnCollection dcc = (DataColumnCollection) obj;
        return this.columns.equals(dcc.getColumns());
    }
}
