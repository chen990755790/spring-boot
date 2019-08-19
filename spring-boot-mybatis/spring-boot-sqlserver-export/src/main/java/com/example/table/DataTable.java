package com.example.table;


import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class DataTable {

    private DataRowCollection rows; //用于保存DataRow的集合对象

    private DataColumnCollection columns; //用于保存DataColumn的对象

    private String tableName; //表名

    private boolean readOnly = false;

    private int nextRowIndex = 0;

    private DataExpression dataExpression;

    public DataTable() {
        this.columns = new DataColumnCollection();
        this.rows = new DataRowCollection();
        this.rows.setColumns(columns);
        dataExpression = new DataExpression(this);
    }

    public DataTable(String dataTableName) {
        this();
        this.tableName = dataTableName;
    }

    public int getTotalCount() {
        return rows.size();
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DataRowCollection getRows() {
        return rows;
    }

    public DataColumnCollection getColumns() {
        return columns;
    }

    public void setColumns(DataColumnCollection columns) {
        this.columns = columns;
    }

    public Object getValue(int row, String colName) {
        return this.rows.get(row).getValue(colName);
    }

    public Object getValue(int row, int col) {
        return this.rows.get(row).getValue(col);
    }

    public DataRow newRow() {
        DataRow tempRow = new DataRow(this);
        nextRowIndex = nextRowIndex < this.rows.size() ? this.rows.size() : nextRowIndex;
        tempRow.setColumns(this.columns);
        tempRow.setRowIndex(nextRowIndex++);
        addRow(tempRow);
        return tempRow;
    }

    public void setValue(int row, int col, Object value) {
        this.rows.get(row).setValue(col, value);
    }

    public void setValue(int row, String colName, Object value) {
        this.rows.get(row).setValue(colName, value);
    }

    public DataColumn addColumn(String columnName, int dataType) {
        return this.columns.addColumn(columnName, dataType);
    }

    public boolean addRow(DataRow row) {
        if (row.getRowIndex() > this.rows.size())
            row.setRowIndex(this.rows.size());
        return this.rows.add(row);
    }

    public List<DataRow> select(String filterString) {
        List<DataRow> rows = new ArrayList<DataRow>();
        if (StringUtils.isNotEmpty(filterString)) {
            for (Object row : this.rows.getDataRowList()) {
                DataRow currentRow = (DataRow) row;
                if (dataExpression.compute(filterString,
                        currentRow.getItemMap())) {
                    rows.add(currentRow);
                }
            }
            return rows;
        } else {
            return this.rows.getDataRowList();
        }
    }

    public DataTable select(String filterString, String[] columns, boolean distinct) {
        DataTable result = new DataTable();
        List<DataRow> rows = select(filterString);
        for (String c : columns) {
            DataColumn dc = this.columns.get(c);
            DataColumn newDc = new DataColumn(dc.getColumnName(),
                    dc.getDataType());
            newDc.setCaptionName(dc.getCaptionName());
            result.columns.add(newDc);
        }
        for (DataRow r : rows) {
            DataRow newRow = result.newRow();
            newRow.copyFrom(r);
            result.addRow(newRow);
        }
        return result;
    }

    public DataTable select(String tableName, String selectField, String filterString, String groupField) {
        DataTable result = new DataTable();
        return result;
    }

    public Object compute(String expression, String filter) {
        return dataExpression.compute(expression, select(filter));
    }

    public Object max(String columns, String filter) {
        return null;
    }

    private List<DataColumn> getColumns(String colString) {
        List<DataColumn> columns = new ArrayList<DataColumn>();
        return columns;
    }

    @Override
    public String toString() {
        return rows.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        DataTable dt = (DataTable) obj;
        return this.columns.equals(dt.getColumns());
    }
}
