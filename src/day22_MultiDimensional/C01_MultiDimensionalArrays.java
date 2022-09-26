package day22_MultiDimensional;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {

        /*
        tek katli Array lerde array i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve her non primitive data direk yazdirilamayabilir

         ancak array in icerisindeki elementleri direk yazdirabiliyoruz
         cunku genelde primitive data turu veya String elementler kullaniliyordu

         multi dimensional arraylerde ne dikkat edecegimiz konu ulasmak istedigimiz elemnetin bir array mi
         yoksa primitive data mi oldugudur
         */

        int [] [] sayilar={{1,2,4,5}, {3,4}};

        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]

        ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz
         */

        System.out.println(sayilar[0]); // [I@eed1f14
        System.out.println(Arrays.toString(sayilar[0])); // [1,2,4,5]
        System.out.println(sayilar[0] [1]); //2
        System.out.println(sayilar[1] [0]); //3

        System.out.println(Arrays.toString(sayilar)); // [[I@eed1f14, [I@7229724f]
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

        /*
        arrayi iki sekilde declare edebiliyorduk
        1-elemanlari direk yazabiliriz
        2-outer ve inner arraylerin uzunluklarini belirterek olusturabiliriz

        int [][] sayilar= new int [3][4];

        ancak =2. yontemle yaptigimizda inner arrylarin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer arrayin 3 tane inner arrayi vardir her bir iner arrayin ise dorder elemani vardir

        eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz mecburen 1. yontemi kullanmalisiniz
         */

    }
}
