package com.example.table;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataRow {
    //定义该行记录在table所处的行数
    private int rowIndex = -1;

    private DataColumnCollection columns;
    //table的一个引用
    private DataTable table;

    //用于存储数据的Map对象，这里保存的对象不包括顺序信息，数据获取的索引通过行信息标识
    private Map<String, Object> itemMap = new LinkedHashMap<String, Object>();


    public DataRow() {
    }

    public DataRow(DataTable table) {
        this.table = table;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public DataTable getTable() {
        return table;
    }

    public DataColumnCollection getColumns() {
        return columns;
    }

    public void setColumns(DataColumnCollection columns) {
        this.columns = columns;
    }

    public void setValue(int index, Object value) {
        setValue(this.columns.get(index), value);
    }

    public void setValue(String columnName, Object value) {
        setValue(this.columns.get(columnName), value);
    }

    public void setValue(DataColumn column, Object value) {
        if (column != null) {
            String columnName = column.getColumnName();
            if (getItemMap().containsKey(columnName))
                getItemMap().replace(columnName, value);
            else
                getItemMap().put(columnName, value);
        }
    }

    public Object getValue(int index) {
        String colName = this.columns.get(index).getColumnName();
        return this.getItemMap().get(colName);
    }

    public Object getValue(String columnName) {
        return this.getItemMap().get(columnName);
    }

    public Map<String, Object> getItemMap() {
        return itemMap;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public void copyFrom(DataRow row) {
        this.itemMap.clear();
        for (DataColumn c : this.columns.getColumns()) {
            this.itemMap.put(c.toString(), row.getValue(c.toString()));
        }
    }

    @Override
    public String toString() {
        return itemMap.toString();
    }
}
