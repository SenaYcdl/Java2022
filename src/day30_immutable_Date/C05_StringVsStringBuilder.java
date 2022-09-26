package day30_immutable_Date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {

        /*
        String mi yoksa StringBuilder mi daha hizlidir?
        bunun icin bir String olusturup,1000 kere sonuna . ekleyelim
        oncesinde ve sonrasinda zamani alip
        aradaki farki bulalim

        ayni islemi string builder icin de yapalim
         */


        //String cozumu
        LocalTime baslangic= LocalTime.now();

        String str="Ahhh Java";
        for (int i=0; i<10000; i++) {
            str+=".";

        }

        LocalTime bitis= LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String Zaman: " + (bitis.getNano()-baslangic.getNano()));



        //StringBuilder cozumu

        baslangic= LocalTime.now();

        StringBuilder sb=new StringBuilder("Ahh Java");
        for (int i=0; i<10000; i++) {
          sb.append(".");

        }

        bitis= LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);
        System.out.println("String Builder Zaman: " + (bitis.getNano()-baslangic.getNano()));



    }
}
