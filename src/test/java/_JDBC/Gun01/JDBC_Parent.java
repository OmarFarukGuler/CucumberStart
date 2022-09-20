package _JDBC.Gun01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Parent {


    private static Connection connection;
    protected static Statement statement;

    @BeforeTest
    public void DBConnectionOpen(){
        //Baglanti islemleri
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";//hostname,port / db adi
        String username = "root";//username
        String password = "'\"-LhCB'.%k[4S]z";//password

        try {
            connection = DriverManager.getConnection(url,username,password);
            statement   = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    @AfterTest
    public void DBConnectionClose(){
        //Close islemleri

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
