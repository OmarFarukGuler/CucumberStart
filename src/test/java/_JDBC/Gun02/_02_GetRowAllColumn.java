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
        // % : de??i??kenin de??erini i??aret eder     //log da duzenli cikti almak icin
        // - : sola dayal?? yazd??r??r, default sa??a dayal??
        // 20: ka?? hane kullan??lacak herzaman onun bilgisi
        // s : string de??erler i??is , say??sal de??erler i??in d kullan??l??r
        // "%5.2d" : say?? i??in 5 hane kullan, ondal??kl?? k??s??m i??in 2 hane

//ibrahimden ek bilgi
//        System.out.printf("%,d",sayi); // %,d araya virg??l koyunca parasal ifadelerde aralar??na nokta koyarak yazd??r??r //12.345.678
//        String str="Merhaba D??nya";
//        System.out.printf("%n %s",str);//%s ile string ifadeyi oldu??u gibi yazd??rd??k //Merhaba D??nya
//        System.out.printf("%n %S",str);//%S b??y??k S ile string ifadeyi b??y??k harflerle yazd??rd??k //MERHABA D??NYA
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
