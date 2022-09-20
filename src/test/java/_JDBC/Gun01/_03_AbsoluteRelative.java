package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_AbsoluteRelative extends JDBC_Parent {

    @Test
    private void test1() throws SQLException {

        // next(),sonraki row
        // previous(),onceki row
        // absolute(5) nokta atisi row ,(for example row 5 ,index 1 den basliyor)
        //absolut(-5) lastindex 5 demek.index sondan baslamis olur
        //relativ(4), bulunulan noktadan itibaren sayarak istenilen row a gider



        ResultSet rs=statement.executeQuery("select*from film");
        rs.absolute(10);
        String title= rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(15);
        title= rs.getString("title");
        System.out.println("title = " + title);

        rs.absolute(-15);
        title= rs.getString("title");
        System.out.println("title = " + title);



        rs.relative(5);
        title= rs.getString("title");
        System.out.println("title = " + title);

        rs.relative(-5);
        title= rs.getString("title");
        System.out.println("title = " + title);






    }
}
