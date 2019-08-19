package com.example.table;

import java.util.Objects;

public class DataColumn {
    private boolean readOnly; // 只读

    private DataTable table; //dataTable的引用

    private String columnName; //列名

    private String captionName; //显示名称

    private int columnIndex;//列索引

    private int dataType;//列数据类型

    private String dataTypeName;//数据类型名称

    public DataColumn() {
        this("default1");
    }

    public DataColumn(int dataType) {
        this("default1", dataType);
    }

    public DataColumn(String columnName) {
        this(columnName, 0);
    }

    public DataColumn(String columnName, int dataType) {
        this.setDataType(dataType);
         this.columnName = columnName;

    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public DataTable getTable() {
        return table;
    }

    public void setTable(DataTable table) {
        this.table = table;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getCaptionName() {
        return captionName;
    }

    public void setCaptionName(String captionName) {
        this.captionName = captionName;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public String getDataTypeName() {
        return dataTypeName;
    }

    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataColumn column = (DataColumn) o;
        return columnName.equals(column.columnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName);
    }
}
