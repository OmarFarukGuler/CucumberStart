package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _06_Soru {

/*
      Bir önceki soruda kullanıcıdan bu sefer sütun numarası
      isteyiniz ve o sütundaki bütün bilgileri yazdırınız
     */



    public static void main(String[] args) throws IOException {


       // Scanner readString=new Scanner(System.in);
        Scanner readNum=new Scanner(System.in);
        System.out.print("Sutun numarasini giriniz =");
        int sutunNumarasi=readNum.nextInt();

        System.out.println(TumSutun(sutunNumarasi));


    }
    public static String TumSutun(int sutunNosu) throws IOException {
        String aranan="";
        String path = "src/test/java/ApachePOI/_00_ResourceExcel/LoginData.xlsx";
        FileInputStream conjunction = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(conjunction);
        Sheet sheet = workbook.getSheet("Login");//Sheet sheet=workbook.getSheet("DiologContent");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);

                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                  if (sheet.getRow(i).getPhysicalNumberOfCells()>sutunNosu){
                    Cell content = row.getCell(sutunNosu);
                    aranan  =aranan+" "+ content.toString();}
                }
        }

        return aranan;
    }
}





