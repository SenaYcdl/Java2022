package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /*
        binarySearch javada eleman aramanin kisa yoludur
        ancak binarySearch un calimasi icin once array in sirali hale getirilmesi gerekir
        eger siralama yapmadan binarySearch yaparsak sonucu bulamayabilir veya yanlis bulabiliriz
         */

        String [] harfler={"Y", "B", "D", "G", "O", "A"};
        String arananHarf="Y";



        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        // binarySearch bize aradigimiz elemanin indexini dondurur
        //Array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));


    }
}
