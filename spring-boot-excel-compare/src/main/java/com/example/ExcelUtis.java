package com.example;

import com.example.model.Domain;
import com.example.model.Excel;
import com.example.model.TableSheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelUtis {

    public static Excel readExcel(String fileName) throws IOException, InvalidFormatException {
        Excel excel = new Excel();
        String excelName = fileName.substring(fileName.lastIndexOf("\\"));
        excel.setExcelName(excelName);
        FileInputStream fileInputStream = new FileInputStream(fileName);
        if (fileInputStream == null) throw new FileNotFoundException(fileName + "不存在");
        XSSFWorkbook workbook = new XSSFWorkbook(OPCPackage.open(fileInputStream));
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        while (sheetIterator.hasNext()) {
            Sheet next = sheetIterator.next();
            TableSheet sheet = TableSheet.createSheet(TableSheet::new);
            sheet.setSheetName(next.getSheetName());
            excel.addSheet(parseSheet(sheet,next));
        }
        return excel;
    }

    private static TableSheet parseSheet(TableSheet tableSheet,Sheet sheet){
        Row columnRow = sheet.getRow(0);
        Row describeRow = sheet.getRow(1);
        int physicalNumberOfCells = columnRow.getPhysicalNumberOfCells();
        for (int i=0;i<physicalNumberOfCells;i++) {
            Domain domain = Domain.createDomain(Domain::new);
            domain.setColumnName(columnRow.getCell(i).getStringCellValue());
            domain.setContent(describeRow.getCell(i).getStringCellValue());
            tableSheet.addDomain(domain);
        }
        return tableSheet;
    }
}
