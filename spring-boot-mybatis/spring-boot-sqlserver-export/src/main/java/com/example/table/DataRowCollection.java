package com.example.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DataRowCollection {

    private DataColumnCollection columns;

    private List<DataRow> dataRowList = new ArrayList<DataRow>();

    public List<DataRow> getDataRowList() {
        return dataRowList;
    }

    public void add(int i, DataRow dataRow) {
        dataRowList.add(i, dataRow);
    }

    public boolean add(DataRow dataRow) {
        return dataRowList.add(dataRow);
    }

    public boolean add(Object object) {

        return true;
    }

    public void add(int i, Object object) {

    }

    public boolean addAll(Collection collection) {
        return dataRowList.addAll(collection);
    }

    public void clear() {
        dataRowList.clear();
    }

    public void setColumns(DataColumnCollection columns) {
        this.columns = columns;
    }

    public int size() {
        return dataRowList.size();
    }

    public DataRow get(int i) {
        return dataRowList.get(i);
    }
    @Override
    public String toString(){
        return dataRowList.toString();
    }
}
