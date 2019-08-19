package com.example.table;

import java.util.ArrayList;
import java.util.List;

/**
 * describe:
 *
 * @author 陈超
 * @date 2019/08/15
 */
public class DataSet {

    private List<DataTable> tableList;

    public DataSet(){
        tableList = new ArrayList<>();
    }


    public List<DataTable> getTableList() {
        return tableList;
    }

    public boolean addTable(DataTable table){
        return tableList.add(table);
    }

    @Override
    public String toString(){
        return tableList.toString();
    }
}
