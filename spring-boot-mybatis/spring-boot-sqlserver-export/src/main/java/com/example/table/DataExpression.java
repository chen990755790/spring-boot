package com.example.table;

import java.util.Collection;
import java.util.Map;

public class DataExpression {

    private DataTable table;

    public DataExpression(DataTable dataTable){
        this.table = dataTable;
    }

    public Object compute(String s, Collection<DataRow> dataRowCollection) {
        return null;
    }

    public DataTable getTable(){
        return this.table;
    }

    public void setTable(DataTable dataTable){
        this.table = dataTable;
    }

    public boolean compute(String s, Map<String,Object> map){
        return true;
    }
}
