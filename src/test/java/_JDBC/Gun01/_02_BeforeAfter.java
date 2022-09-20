package _JDBC.Gun01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter extends JDBC_Parent {


    @Test
    public void test1() throws SQLException {
//sorgu calisacak
        ResultSet rs=statement.executeQuery("select*from language");
        rs.next();
        String dilAdi= rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi= rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi= rs.getString("name");
        System.out.println("dilAdi = " + dilAdi);






    }


    @Test
    public void test2() throws SQLException {

        ResultSet rs=statement.executeQuery("select*from language");
        rs.next();
        String dilAdi= rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi= rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi= rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);


    }

    @Test
    public void test3() throws SQLException {

        ResultSet rs=statement.executeQuery("select*from language");
        rs.next();
        String dilAdi= rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);

        rs.next();
        dilAdi= rs.getString(2);//bir sonrakine gider
        System.out.println("dilAdi = " + dilAdi);

        rs.previous(); // English  // bulunduğu yerden bir önceki satıra gider
        dilAdi= rs.getString(2);
        System.out.println("dilAdi = " + dilAdi);


    }


}
