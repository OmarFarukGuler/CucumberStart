package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class ExcelUtility {

    public static ArrayList<ArrayList<String>> getListData(String path, String sayfaAdi, int okunacakSutunSayisi) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();
        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sayfa = workbook.getSheet(sayfaAdi);

        for (int i = 0; i < sayfa.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> satirData = new ArrayList<>();
            for (int j = 0; j < okunacakSutunSayisi; j++) {
                satirData.add(sayfa.getRow(i).getCell(j).toString());
            }
            tablo.add(satirData);
        }

        return tablo;
    }

    public static void WriteExcel(String path, Scenario scenario,String browserName,String time){
File f=new File(path);

        if (!f.exists()) {

            XSSFWorkbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");
            Row row = sheet.createRow(0);

            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getName());

            row.createCell(1).setCellValue(scenario.getStatus().toString());
            row.createCell(2).setCellValue(browserName);
            row.createCell(3).setCellValue(time);

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        else {
            FileInputStream inputStream=null;
            Workbook workbook=null;
            try {
                inputStream=new FileInputStream(path);
                workbook=WorkbookFactory.create(inputStream);
            }catch (IOException e){
                throw  new RuntimeException(e);
            }
            Sheet sheet=workbook.getSheetAt(0);

            int rowCount= sheet.getPhysicalNumberOfRows();
            Row row= sheet.createRow(rowCount);

            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getName());

            row.createCell(1).setCellValue(scenario.getStatus().toString());
            row.createCell(2).setCellValue(browserName);
            row.createCell(3).setCellValue(time);

            try {
                inputStream.close();
                FileOutputStream outputStream=new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }catch (IOException e){
                throw  new RuntimeException(e);
            }

        }


    }
}


