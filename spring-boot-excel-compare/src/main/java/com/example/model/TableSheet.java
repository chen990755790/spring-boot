package com.example.model;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

@Data
public class TableSheet {

    public static TableSheet createSheet(final Supplier<TableSheet> sheet){
        return sheet.get();
    }

    private String sheetName;

    private List<Domain> columns ;

    public TableSheet(){
        columns = new LinkedList<>();
    }

    public void addDomain(Domain domain){
        if (columns.contains(domain)) {
            int i = columns.indexOf(domain);
            columns.get(i).setExistCount(columns.get(i).getExistCount()+1);
            columns.set(i,columns.get(i));
        } else {
            columns.add(domain);
        }
    }

    @Override
    public String toString() {
        return "TableSheet{" +
                "sheetName='" + sheetName + '\'' +
                ", columns=" + columns +
                '}';
    }

}
