package _JDBC.Gun01;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.*;


public class _04_Soru extends JDBC_Parent {

    //city tablosundaki tum kayıtlari next ile yazdiriniz
    //city tablosundaki tum kayıtlari absolute ile yazdiriniz
    //city tablosundaki tum kayıtlari relativ ile yazdiriniz

    Connection connection = null;
    Statement statement = null;

    @Test
    public void odev1() throws SQLException {

        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password


        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        ResultSet resultSet = statement.executeQuery("select*from city");

      /*  resultSet.absolute(-1);
        int lastRowIndex=resultSet.getRow();//city de kac row oldugunu bulduk
        System.out.println("lastRowIndex = " + lastRowIndex);
*/

        int say = 1;
        do {

            resultSet.next();
            String city_id = resultSet.getString("city_id");
            String city = resultSet.getString("city");
            String country_id = resultSet.getString("country_id");
            System.out.print(city_id + " " + city + " " + country_id + "\n");


            say++;

        } while (say <= 600);


        connection.close();


    }

    //city tablosundaki tum kayıtlari absolute ile yazdiriniz
    @Test
    public void odev2() throws SQLException {

        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

         /*resultSet.absolute(-1);
       int lastRowIndex=resultSet.getRow();//city de kac row oldugunu bulduk
        System.out.println("lastRowIndex = " + lastRowIndex);*/

        ResultSet resultSet = statement.executeQuery("select*from city order by city_id");
        int say = 1;

        do {
            resultSet.absolute(say);
            String city_id = resultSet.getString("city_id");
            String cityName = resultSet.getString("city");
            String country_id = resultSet.getString("country_id");
            System.out.println(city_id + " " + cityName + " " + country_id);

            say++;
        } while (say <= 600);

        System.out.println("say = " + say);
        System.out.println("resultSet = " + resultSet.getRow());

        connection.close();
    }

    //city tablosundaki tum kayıtlari relativ ile yazdiriniz
    @Test
    public void odev3() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password


        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ResultSet resultSet=statement.executeQuery("select*from city order by city_id");
      /*resultSet.absolute(-1);-1 yazarsan sondan baslar
       int lastRowIndex=resultSet.getRow();//city de kac row oldugunu bulduk
        System.out.println("lastRowIndex = " + lastRowIndex);*/
        int say=1;
        do {
            resultSet.relative(1);//row birden basladi ve her seferinde bulundugu rowdan bir yukaridaki rowa gitti
            String city_id=resultSet.getString("city_id");
            String cityName=resultSet.getString("city");
            String country_id=resultSet.getString("country_id");
            System.out.println(city_id+" "+cityName+" "+country_id);

            say++;
        }while (say<= 600);
    }

  /*  @Test
    public void test4(){
        //ResultSet resultSet=statement.executeQuery("select*from city");
        int count=0;
        //while (resultSet.relative())*/
   // }
}
