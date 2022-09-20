package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachePoiGetAllData {
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/_00_ResourceExcel/ApacheExcel2.xlsx";

        FileInputStream inputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(inputStream);

        Sheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();//get satir sayisi

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();//get hucre sayisi
            for (int j = 0; j < cellCount; j++) {
                Cell hucre=row.getCell(j);
                System.out.println(hucre);

            }

        }


    }
}
