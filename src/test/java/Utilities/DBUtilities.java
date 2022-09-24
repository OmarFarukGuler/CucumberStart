package Utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;

public class DBUtilities {

    private static Connection connection;
    protected static Statement statement;

    @BeforeTest
    public static void DBConnectionOpen(){
        //Baglanti islemleri                                                                    //sakila
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/zz_OFG_PROJE";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password

        try {
            connection = DriverManager.getConnection(url,username,password);
            statement   = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //ResultSet rs=statement.executeQuery("select*from film");

    }
    @AfterTest
    public static void DBConnectionClose(){
        //Close islemleri

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
//        ArrayList<ArrayList<String>> tablo= getListData("select*from actor");
//        System.out.println(tablo.toString());

    }
    public static ArrayList<ArrayList<String>>  getListData(String query){
        ArrayList<ArrayList<String>> tablo=new ArrayList<>();
        DBConnectionOpen();

        try {
            ResultSet rs = statement.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while (rs.next()) {
                ArrayList<String> satir=new ArrayList<>();
                for (int i = 1; i < rsmd.getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }
               tablo.add(satir) ;
            }
        }catch (Exception ex){
            System.out.println("ex = " + ex);
        }

        DBConnectionClose();
        return tablo;
    }
}
