package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {


        String path = "src/test/java/ApachePOI/_00_ResourceExcel/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");


        Row newRow= sheet.createRow(0);//Satir olusturduk
        Cell newCell=newRow.createCell(0);//hucre olusturduk
        newCell.setCellValue("Merhaba Dunya");//bilgi yazildi ama gonderilmedi

        for (int i = 1; i < 10; i++) {
            newRow.createCell(i).setCellValue("omer");}


       /* Sheet sheet2=workbook.createSheet("Sheet2");
        Row newRow2= sheet.createRow(0);//Satir olusturduk
        Cell newCell2=newRow.createCell(0);//hucre olusturduk
        newCell.setCellValue("Merhaba Dunya");//bilgi yazildi ama gonderilmedi
        for (int i = 0; i < 20; i++) {
            newRow.createCell(i).setCellValue(i);}*/

        //sira kaydetmeye geldi,butun bilgiler hafizada,her sey WORKBOOK ta

        inputStream.close(); // okuma modunu kapattik.yazma moduna gecmek icin

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("islem tamamlandi");


    }

}
