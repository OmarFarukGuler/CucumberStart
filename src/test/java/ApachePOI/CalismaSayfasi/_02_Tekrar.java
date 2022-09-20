package ApachePOI.CalismaSayfasi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _02_Tekrar {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        Sheet sheet= workbook.createSheet("Karabas");
        Row row=sheet.createRow(5);
        Cell cell=row.createCell(10);
        cell.setCellValue("Maraba Dunya");//hafizada olusturuldu

        String path="src/test/java/ApachePOI/CalismaSayfasi/Excells.excel2.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();

    }
}
