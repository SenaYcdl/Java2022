package day34_Inheritance;

public class Isci extends Personel {

    int persNo=1001;

    public static void main(String[] args) {


        /*
        normal hayatimizda parent cocuk sahibi olmaya karar verebilir
        Java da ise child classlar ozelliklerini inherit etmek istedikleri
        classi kendilerine parent edinirler.

        mesela isci classini olusturunca nelere ihtiyaci var diye dusunursek
        personel classindaki tum variable methodlara ihtiyaci oldugunu gorebiliriz
        Bu durumda yeniden o variable ve methodlari olusturmak yerine Personel classini
        kendimize parent ediniriz

        Bir classi parent edinmek icin extends keyword kullanmaliyiz

        bir class baska bir calssi parent edildiginde:
        1-parent calss daki tum ozelliklere(variable+method)otomatik olarak sahip olur
        2-parent classdaki ozelliklerden bazilarini kendilerine uyarlayabilir
        3-parent classda olmayan bazi yeni ozellikler olusturabilir
        not:parent classdaki ozelliklerden hicbirini reddedemez ama
        degistirebilir
         */

        Isci isci1=new Isci();
        System.out.println(isci1.isim);
        //kendi clasimizda isim variable yok,onun icin parent a gideriz
        isci1.isim="Selim";
        System.out.println(isci1.persNo); // 1001 kendi classimizda varsa onu kulaniriz

        isci1.maas(); // Isciler minimum 15 euro saat ucreti alir
    }

    public void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alir");
    }

    public void ozelSigorta()  {
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptilrilir");
    }
}
