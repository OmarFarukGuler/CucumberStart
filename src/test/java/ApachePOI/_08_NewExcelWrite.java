package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();//Sifirdan WorkBook olusturduk.
        Sheet sheet=workbook.createSheet("Sayfa1");//isim verdik

        Row newRow= sheet.createRow(0); // satır oluşturuldu 0.yerde
        Cell newCell= newRow.createCell(0); // yeni satırda ilk hucre oluşturuldu
        newCell.setCellValue("Merhaba Dünya"); // bilgi yazıldı.

        for (int i = 1; i < 11; i++) {
            newRow.createCell(i).setCellValue(i);}

        String sifirdanExcelDosyasi= "src/test/java/ApachePOI/Resource/sifirdanExcelDosyasi.xlsx";
        FileOutputStream outputStream=new FileOutputStream(sifirdanExcelDosyasi);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("islem tamamlandi");



    }
}
