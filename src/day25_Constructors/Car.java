package day25_Constructors;

public class Car {
    /*
    Bu class bizim kaliphanemiz
    bie araba olusturmak icin ihtiyacimiz olan variable ve methodlari bu class da belirleriz

    sonra farkli class larda araba olusturmamaiz gerkirse bu class dan bir obje
    olusturup burada belirlenen variable ve methodlara gore araba uretiriz
     */

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;


    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max " + hiz + "km hiz yapar" );
    }

}
