package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePoiStart {
    public static void main(String[] args) throws IOException {
        //exel dosyasinin yolunu aldik
        String path="src/test/java/ApachePOI/Resource/ApacheExcel2.xlsx";
        //dosyayi okuyabilmek icin dosyayi acmamiz lazim .ya okumak icin acabiliriz ya da dosyaya bir seyler yazmak icin
        //ikisi bir arada olmaz

        //dosya okuma islemcisine dosyanin yolunu veriyoruz.boyle program ile dosya arasinda baglanti kuruyoruz
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);//alti kirmizi  add throws FileNotFoundException
        //workbook->sheet->row->cell sirayla bilgilere ulasacaz

        //hafizaya workbook u alip olusturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);//IoException FileNotFounExceptionu kapsar

        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");//isimle(String) veya Numarasiyla(int) ulasabiliriz

        Row satir=calismaSayfasi.getRow(0);//satirlara ulastik

        Cell hucre=satir.getCell(0);//hucreye ulastik

        System.out.println(hucre);





    }
}
