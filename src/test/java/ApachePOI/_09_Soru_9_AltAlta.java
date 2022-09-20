package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_Soru_9_AltAlta {
    public static void main(String[] args) throws IOException {


        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sayfa1");
        int say=0;
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
            Row newRow = sheet.createRow(j+say);
                newRow.createCell(0).setCellValue((i));
                newRow.createCell(1).setCellValue("*");
                newRow.createCell(2).setCellValue(j);
                newRow.createCell(3).setCellValue("=");
                newRow.createCell(4).setCellValue((i)*(j));
            }
         say+=12;

        }
        String sifirdanExcelDosyasi2 = "src/test/java/ApachePOI/Resource/sifirdanExcelDosyasi3.xlsx";//excel i nereye hangi isimle kaydedecegimizi belirledik
        FileOutputStream outputStream = new FileOutputStream(sifirdanExcelDosyasi2);  // run yapinca olusturuldu
        workbook.write(outputStream);                                                 // hafizada bekleyen bilgiler excel e yazdirildi
        workbook.close();                                                             //excel kapatildi
        outputStream.close();                                                         //hafizadan akis bitirildi.
        System.out.println("islem tamamlandi");
    }

}
