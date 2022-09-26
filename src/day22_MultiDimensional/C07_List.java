package day22_MultiDimensional;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        /*
        List primitive data turlerini kabul etmez
        Wrapper class ile yapabiliriz
         */

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); // [5, 3, 7]
        //sadece add kullanirsak java sona ekler

        sayilar.add(2,10); // indexi 2 olan yere 10 elementini ekleyelim

        System.out.println(sayilar); // [5, 3,10,7]

        //add(index,element) istedigimiz indexe istedigimiz elementi yerlestirir
        //add methodu eski elementleri silmez veya update etmez,yeni element ekler

    }
}
