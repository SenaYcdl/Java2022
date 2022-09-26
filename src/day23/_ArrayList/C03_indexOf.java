package day23._ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler);

        /*
        indexof methodu bize bilgi donduren bir method dur
        listemizi degistirmez
         */

        System.out.println(urunler.lastIndexOf("Ikram"));

        /*
        indexof methodu urunu aramaya 0. index den
        lastIndexOf methodu ise aramaya son index ten baslar

         arama bitip urun bulundugunda ikiside bulunan urunun indexini verir
         */

        urunler.add("Ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler.lastIndexOf("Ikram"));

        System.out.println(urunler.indexOf("Hobby"));
        System.out.println(urunler.lastIndexOf("Hobby"));

    }
}
