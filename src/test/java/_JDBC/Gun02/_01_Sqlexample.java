package _JDBC.Gun02;

import Utilities.DBUtilities;
import _JDBC.Gun01.JDBC_Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_Sqlexample extends JDBC_Parent {
    // last,first,getRow,getInd,getDouble
    @Test
    public void test1() throws SQLException {
        ResultSet resultSet= statement.executeQuery("select*from city");
        resultSet.last();// last indeksi en sondan baslatir.
        String id=resultSet.getString(1);//indeksi string olarak aldik
        System.out.println("id = " + id);

        int idInt=resultSet.getInt(1);//indeksi int olarak aldik
        System.out.println("idInt = " + idInt);

        String name=resultSet.getString(2);
        System.out.println("name = " + name);

        int nameInt=resultSet.getInt(2);//Cell de int e donusebilen  karakter olmazsa hata verir. isim= hata
        System.out.println("nameInt = " + nameInt);


        int getRow= resultSet.getRow();//bulunulan row un indeksini verir
        // result.last() ile en sona gidip getRow ile toplam row sayisini buluruz.

        resultSet.first();//ilk row a gittik.

    }



}
