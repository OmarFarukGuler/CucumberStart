package _JDBC.Gun02;

import _JDBC.Gun01.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _02_GetRowAllColumn extends JDBC_Parent {

    @Test
    public void test1() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select*from language");
        resultSet.getMetaData();//Datanin haricinde kalan bilgileri almak icin kullanilir
        //Result: data+meta (data disindaki diger bilgiler kolon sayisi vs.)
        ResultSetMetaData rsMD = resultSet.getMetaData();

        int columnCount = rsMD.getColumnCount();
        System.out.println("columnCount = " + columnCount);

        for (int i = 1; i < columnCount; i++) {//index in 1 den basladigindan emin ol.sql de index ler 1 den basliyor.
            String columnName = rsMD.getColumnName(i);
            String columnTypeName = rsMD.getColumnTypeName(i);

            System.out.println(columnName + " " + columnTypeName);
        }


    }

    //soru=Tum Language table i yazdiriniz
    @Test
    public void Soru() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select*from language");
        //Datanin haricinde kalan bilgileri almak icin kullanilir
        //Result: data+meta (data disindaki diger bilgiler kolon sayisi vs.)
        ResultSetMetaData rsMD = resultSet.getMetaData();

        int columnCount = rsMD.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {//index in 1 den basladigindan emin ol.sql de index ler 1 den basliyor.
            String columnName = rsMD.getColumnName(i);


            System.out.printf("%-20s", columnName + "  ");

        }
        // language_id name last_update

        System.out.println("");
//        resultSet.first();

        while (resultSet.next()) {
            String language_id = resultSet.getString(1);
            String name = resultSet.getString(2);
            String last_update = resultSet.getString(3);

            System.out.printf("%-20s", language_id);
            System.out.printf("%-20s", name);
            System.out.printf("%-20s", last_update);
            System.out.println();

        }
        // % : değişkenin değerini işaret eder     //log da duzenli cikti almak icin
        // - : sola dayalı yazdırır, default sağa dayalı
        // 20: kaç hane kullanılacak herzaman onun bilgisi
        // s : string değerler içis , sayısal değerler için d kullanılır
        // "%5.2d" : sayı için 5 hane kullan, ondalıklı kısım için 2 hane

//ibrahimden ek bilgi
//        System.out.printf("%,d",sayi); // %,d araya virgül koyunca parasal ifadelerde aralarına nokta koyarak yazdırır //12.345.678
//        String str="Merhaba Dünya";
//        System.out.printf("%n %s",str);//%s ile string ifadeyi olduğu gibi yazdırdık //Merhaba Dünya
//        System.out.printf("%n %S",str);//%S büyük S ile string ifadeyi büyük harflerle yazdırdık //MERHABA DÜNYA
        //     System.out.printf("%10s %10s %10s \n", "Language_id", "name", "last_update");

    }

    @Test
    public void Soru2() throws SQLException {
        String sorgu = "select*from actor";
       soru2_2(sorgu);
    }


    public void soru2_2(String sorgu) throws SQLException {
        ResultSet resultSet = statement.executeQuery(sorgu);
        ResultSetMetaData rsMD = resultSet.getMetaData();
        int columnCount = rsMD.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {//index in 1 den basladigindan emin ol.sql de index ler 1 den basliyor.
            String columnName = rsMD.getColumnName(i);
            System.out.printf("%-20s", columnName + "  ");
        }
        // language_id name last_update
        System.out.println("");

//        resultSet.first();
        while (resultSet.next()) {
            String language_id = resultSet.getString(1);
            String firstName = resultSet.getString(2);
            String lastName = resultSet.getString(3);
            String last_update = resultSet.getString(4);
            System.out.printf("%-20s", language_id);
            System.out.printf("%-20s", firstName);
            System.out.printf("%-20s", lastName);
            System.out.printf("%-20s", last_update);
            System.out.println();


        }
    }
}
