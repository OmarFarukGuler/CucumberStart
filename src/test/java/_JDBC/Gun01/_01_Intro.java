package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void Test1() throws SQLException {
        //jdbc: sabit, mysql:(hangi DB kullniliyorsa o yazilir) kalan DB nin yolu (adresi),3306:(port) (calisma ani numarasi)
        //her programa caliisma sirasinda bir numara verilir.Gelen bilgiler basinda bu numara ile gelir ve ilgili programa iletilir
        //bu numaraya por denir
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement   = connection.createStatement();//sorgulari calistirmak icin page acildi
        ResultSet resultSet = statement.executeQuery("select * from actor");//sorgu sonucu olustu hafizada bekliyor

        resultSet.next();

        String first_name=resultSet.getString("first_name");//data da en ustteki isim ,etiket
        System.out.println("firstNmae = " + first_name);

        String last_name=resultSet.getString("last_name");//data da en ustteki isim ,etiket
        System.out.println("lastname = " + last_name);

        resultSet.next();//ikinci isim bolumu bu sekilde next() ile aliniyor

        first_name=resultSet.getString("first_name");//data da en ustteki isim ,etiket
        System.out.println("firstNmae = " + first_name);

        last_name=resultSet.getString("last_name");//data da en ustteki isim ,etiket
        System.out.println("lastname = " + last_name);

        connection.close();







    }

}
//Hostname: db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com
//        userName : root
//        Password: '"-LhCB'.%k[4S]z
