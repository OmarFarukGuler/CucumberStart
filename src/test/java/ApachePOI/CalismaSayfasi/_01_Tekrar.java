package ApachePOI.CalismaSayfasi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _01_Tekrar {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Sheet1");
        Row row=sheet.createRow(0);
        Cell cell= row.createCell(0);

        cell.setCellValue("OFG");

        String path="src/test/java/ApachePOI/CalismaSayfasi/Excells.excel1.xlsx";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);
        xssfWorkbook.close();
        fileOutputStream.close();



    }
}
