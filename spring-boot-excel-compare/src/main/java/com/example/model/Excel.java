package com.example.model;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class Excel {

    private String excelName;

    private List<TableSheet> sheetList;

    public Excel() {
        sheetList = new LinkedList<>();
    }

    public void addSheet(TableSheet tableSheet) {
        sheetList.add(tableSheet);
    }

    @Override
    public String toString() {
        return "Excel{" +
                "excelName='" + excelName + '\'' +
                ", sheetList=" + sheetList +
                '}';
    }

    public Map<String, List<Domain>> getRepeatColumn() {
        Map<String, List<Domain>> map = new LinkedHashMap<>();
        Iterator<TableSheet> iterator = sheetList.iterator();
        while (iterator.hasNext()) {
            TableSheet sheet = iterator.next();
            List<Domain> collect = sheet.getColumns().parallelStream().filter(n -> n.getExistCount() > 1).collect(Collectors.toList());
            if (collect.size() > 0) map.put(sheet.getSheetName(), collect);
        }
        return map;
    }

}
