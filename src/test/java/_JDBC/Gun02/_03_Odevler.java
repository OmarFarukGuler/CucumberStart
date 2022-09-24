package _JDBC.Gun02;

import Utilities.DBUtilities;
import Utilities.ExcelUtility;
import _JDBC.Gun01.JDBC_Parent;
import com.beust.jcommander.Parameter;
import io.cucumber.testng.CucumberOptions;
import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class _03_Odevler extends JDBC_Parent {
//    Soru 1: getTable için yaptığını örneğin aynısını,
//    bir XML filedan sorguyu parametre olarak göndererek bir Test için yapınız.
//
//            Soru 2 :  Actor tablsosundaki tüm verileri yeni excel e yazdırınız.
//    
//    Soru 3: Bir excelde aşağıdaki bilgiler vardır
//    Bu bilgilerin yerleşeceği tabloyu kendi DB nizde MySQL arayüzünden
//    oluşturup. Burada JDBC üserinden aşağıdaki bilgileri okuyarak.
//    tabloya insert ediniz. (JDBC Mysql insert komutunun nasıl çalıştırılacağı
//    internetten araştırılacak.)
//
//            no  ad    soyad    telefon
//            1  ismet  Temur   05053434734
//            2  mehmet Yılmaz  05053453434
//            3  Ayşe   Yıldız  0502222434
//            4  Ali    Veli    0505345434


    @Test
    // Soru 2 :  Actor tablsosundaki tüm verileri yeni excel e yazdırınız.
    public void soru2_2() throws SQLException, IOException {
        String path = "src/test/java/_JDBC/excel/actor1.xlsx";
        FileInputStream inputStream = null;
        Workbook workbook = null;
        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);

        ResultSet resultSet = statement.executeQuery("select*from actor");
        ResultSetMetaData rsMD = resultSet.getMetaData();
        int columnCount = rsMD.getColumnCount();
        System.out.println("columnCount = " + columnCount);


        for (int i = 0; i <= 3; i++) {//index in 1 den basladigindan emin ol.sql de index ler 1 den basliyor.
            row = sheet.createRow((0));
            cell = row.createCell((i));
            cell.setCellValue(rsMD.getColumnName(i + 1));
            /*row.createCell((i )).setCellValue(rsMD.getColumnName(i+1));
            row.createCell((i + 1)).setCellValue(rsMD.getColumnName(i+2));
            row.createCell((i + 2)).setCellValue(rsMD.getColumnName(i+3));*/
            System.out.printf("%-20s", rsMD.getColumnName(i + 1));
        }

        System.out.println();

        int j = 1;
        while (resultSet.next()) {
            for (int i = 0; i <= 3; i++) {
                row = sheet.createRow((j));
                cell = row.createCell((i));
                // row.createCell(i).setCellValue(resultSet.getString(i+1));

                cell.setCellValue(resultSet.getString(i + 1));
               /* row.createCell((i)).setCellValue(resultSet.getString(i+1));
                row.createCell((i+1)).setCellValue(resultSet.getString(i+2));
                row.createCell((i+2)).setCellValue(resultSet.getString(i+3));*/
                // System.out.println();
                System.out.printf("%-20s", resultSet.getString(i + 1));

            }
            j++;

            System.out.println();
        }

        System.out.println("j = " + j);

        // inputStream.close(); // okuma modunu kapattik.yazma moduna gecmek icin
        inputStream.close();
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("islem tamamlandi");


    }

    String sql = "INSERT INTO kisiler(kisi_adi, kisi_soyadi, kisi_eposta) VALUES(?, ?, ?)";


//    preparedStatement.setString(1, "Yusuf Sefa");
//preparedStatement.setString(2, "SEZER");
//preparedStatement.setString(3, "yusufsezer@mail.com");
//preparedStatement.execute();
//preparedStatement.executeUpdate();
    //  statement.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");

    //    Soru 3: Bir excelde aşağıdaki bilgiler vardır
//    Bu bilgilerin yerleşeceği tabloyu kendi DB nizde MySQL arayüzünden
//    oluşturup. Burada JDBC üserinden aşağıdaki bilgileri okuyarak.
//    tabloya insert ediniz. (JDBC Mysql insert komutunun nasıl çalıştırılacağı
//    internetten araştırılacak.)
//
//            no  ad    soyad    telefon
//            1  ismet  Temur   05053434734
//            2  mehmet Yılmaz  05053453434
//            3  Ayşe   Yıldız  0502222434
//            4  Ali    Veli    0505345434


    @Test
    public void soru3() throws SQLException, IOException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/zz_OFG_PROJE";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password
        Connection connection = DriverManager.getConnection(url, username, password);

        FileInputStream inputStream;
        Workbook workbook;
        try {
            inputStream = new FileInputStream("src/test/java/_JDBC/Gun02/_03_Soru3Excel.xlsx");
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);}

        Sheet sheet= workbook.getSheet("Sheet1");



        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row= sheet.getRow(i);

            for (int j = 0; j < 1; j++) {

                 String text=row.getCell(j).toString();
                 String text1=row.getCell(j+1).toString();
                 String text2=row.getCell(j+2).toString();
                PreparedStatement ps = connection.prepareStatement(
                        "insert into javadan_insert (ad,soyad,telefon) values ('"+text+"','"+text1+"','"+text2+"')");
                ps.execute();


               // connection.close();
               // inputStream.close();


            }
        }




    }
}
//('ismet', 'Temur', '05053434734'), ('mehmet', 'Yılmaz' ,'05053453434'), ('Ayşe' ,'Yıldız' ,'0502222434'), ( 'Ali', 'Veli' ,'0505345434')");