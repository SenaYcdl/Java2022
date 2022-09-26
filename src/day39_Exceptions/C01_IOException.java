package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException    {

        /*
        Java da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStream classindan yardim aliriz
        Ayni sekilde Java dan bilgisayarimizdaki bir dosyaya ekleme veya update yapmak istersek
        FileInputStream classindan yardim aliriz
         */

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        goruldugu gibi CTime da altini kirmmzi cizen her durum CTE degildir
        Java da bazi exception larda Compile Time Exception dir
        Ozellikler dosya okuma ve yazma ile ilgili exception lar
        Compile Time Exception dir

        Compile Time Exception olustugunda Java cozum icin iki ihtimal onerir
        1-try-catch ile cevrelemek
        2-method signature ina throws keyword ile beklenen exception turunu yazmak

        throws Exception, sadece olayin farkinda oldugumuzun declarasyonudur
        exception in handle edilmesinde hicbir rolu yoktur
        yani try catch ile kontrol altina aldigimiz exception larda kod calismaya devam ediyordu
        ancak throws exception yazdigimizda java bir exception ile karsilasirsa
        hic birsey yapmamasiz gibi hata mesaji yayinlayip calismayi durdurur
         */
    }
}
