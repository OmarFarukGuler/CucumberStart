package ApachePOI.CalismaSayfasi;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_Tekrar {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/CalismaSayfasi/excel3.xlsx";
        /*FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.createSheet("Minnos");
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue("-*-*-*-");*/


        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Karabas");

       // Row newRow= sheet.createRow(0);//Satir olusturduk
      //  Cell newCell=newRow.createCell(0);//hucre olusturduk
       // newCell.setCellValue("dgbgnngn");
       /* for (int i = 0; i < 10; i++) {
            newRow.createCell(i).setCellValue("--**--");}*/

           for (int i = 0; i < 15; i++) {
               Row newRow= sheet.createRow(i);
            for (int j = 15; j > 0; j--) {
                Cell newCell=newRow.createCell(j);
                newCell.setCellValue("--**--");

            }
        }

        for (int i = 15; i < 30; i++) {
            Row newRow= sheet.createRow(i);
            for (int j = 0; j < 15; j++) {
                Cell newCell=newRow.createCell(j);
                newCell.setCellValue("--**--");

            }
        }
        inputStream.close();




        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();







    }
}
