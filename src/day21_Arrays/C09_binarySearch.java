package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {
    public static void main(String[] args) {

        /*
        Binary search methodu siralanmis Array de aradigimiz elemntin indexini dondurur

        Ya aradigimiz element Array de yoksa ?
        (String de indexOf() bize olmayan elementler icin -1 donduruyordu)

        -Aradigimiz element Array de yoksa java hem olmadigini hem de olsaydi nerede
        olacagini bize dondurur

        -Olmadigini ifade icin "-" kullanir olsaydi nerede olacagini belirtmek icin index degil siralama
        kullanir

        !!!!varsa index yoksa sira!!!!

         */

        int [] sayilar={3,7,15,4,27,10};

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        //varsa index, yoksa - sira

        System.out.println(Arrays.binarySearch(sayilar,4)); // 1
        System.out.println(Arrays.binarySearch(sayilar,15)); // 4
        System.out.println(Arrays.binarySearch(sayilar,11)); //
        System.out.println(Arrays.binarySearch(sayilar,6)); //
        System.out.println(Arrays.binarySearch(sayilar,-100)); //


    }
}
