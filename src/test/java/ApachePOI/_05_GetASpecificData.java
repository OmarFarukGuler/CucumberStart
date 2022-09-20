package ApachePOI;

import org.apache.poi.hssf.record.SSTRecord;
import org.apache.poi.ss.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHdrFtr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Verilen Exceldeki password bilgisini bir metoda aracılığı bularak yazdırınız,
 * yani metoda "password" kelimesi gönderilecek, dönen değr password un kendisi olacak.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */

public class _05_GetASpecificData {
    public static void main(String[] args) throws IOException {

        Scanner readString=new Scanner(System.in);
        System.out.print("Aradiginiz kelimeyi giriniz =");
         String kelime=readString.nextLine();

        System.out.println(Password(kelime));


            }
    public static String Password(String sifre) throws IOException {
       String aranan="";
        String path = "src/test/java/ApachePOI/_00_ResourceExcel/LoginData.xlsx";
        FileInputStream conjunction = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(conjunction);
        Sheet sheet = workbook.getSheet("Login");//Sheet sheet=workbook.getSheet("DiologContent");


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            Cell content = row.getCell(0);
            if (content.toString().equals(sifre))
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
              //  Cell content = row.getCell(j);
                //String a = content.toString();
               // if (a.equals(sifre)) {
                    aranan += row.getCell(j+1)+" ";
                }
        }

        return aranan;
    }
}
