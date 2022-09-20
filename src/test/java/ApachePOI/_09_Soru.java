package ApachePOI;

/**  Soru 1:
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
 */

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

/**  Soru 2:
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
 */

/* for (int i=1;i<=10;i++)
         System.out.println("2 x"+i+"="+(i*2));*/ //sadece 2 ler

      /*for (int j=1;j<=10;j++){
              for (int i=1;i<=5;i++){
              System.out.println(j+" x "+i+" = "+(j*i));
              }
              System.out.println();//tablolarin arasina boskuk birakmak icin
              }
*/
public class _09_Soru {
    public static void main(String[] args) throws IOException {


        XSSFWorkbook workbook = new XSSFWorkbook();                 //excel i olusturduk
        Sheet sheet = workbook.createSheet("Sayfa1");    //sayfa olusturduk

        for (int i=0;i<11;i++){
            Row newRow = sheet.createRow(i);                        //satir olusturduk
            for (int j=0;j<11;j++){
                newRow.createCell((j*6)).setCellValue((i));          //hucre olusturduk ve hucreye veri yazdik
                newRow.createCell((j*6)+1).setCellValue("*");    // her sey hafizada olusturuldu.beklemede
                newRow.createCell((j*6)+2).setCellValue(j);
                newRow.createCell((j*6)+3).setCellValue("=");
                newRow.createCell((j*6)+4).setCellValue((i)*(j));
            }
        }
        String sifirdanExcelDosyasi2 = "src/test/java/ApachePOI/Resource/sifirdanExcelDosyasi2.xlsx";//excel i nereye hangi isimle kaydedecegimizi belirledik
        FileOutputStream outputStream = new FileOutputStream(sifirdanExcelDosyasi2);  // run yapinca olusturuldu
        workbook.write(outputStream);                                                 // hafizada bekleyen bilgiler excel e yazdirildi
        workbook.close();                                                             //excel kapatildi
        outputStream.close();                                                         //hafizadan akis bitirildi.
        System.out.println("islem tamamlandi");
    }
}

