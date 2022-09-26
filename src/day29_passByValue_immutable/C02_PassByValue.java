package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        Birden fazla elemnt iceren arrray ve arraylist gibi yapilarda
        da passByvalue gecerlidir,

        eger method da array veya list in kendisi degistirilirse passByvalue ozelligi sebebiyle java degisen degeri
        degil array veya list in orjinal degerini alir

        ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse java
        obje degismedigi icin(referans ayni), ayni array veya listi bize dondurur
        ancak icindeki elementler degismis olacaktir
         */

        /*
        Verilen 4 elemanli bir arrayi methoda gonderelim
        methodda yeni 3 elemanli bir array atayip bu yeni arraye rastgele 100 den
        kucuk 3 sayi atayalim
        methodda arraye yazdiralim

        main methodda da method call daan sonra yeniden methodu yazdiralim
         */

        int [] arr={3,5,8,10};
        arrayiDegistir(arr);
        System.out.println("Method call dan sonra main method da array: " + Arrays.toString(arr));

    }

    public static void arrayiDegistir(int[] arr) {

        arr= new int [3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);

        System.out.println("Methodda array: " + Arrays.toString(arr));
    }
}
