package day22_MultiDimensional;

import java.util.Arrays;

public class Test03_KelimeSayisiArray {
    public static void main(String[] args) {

        /*
        soru 5) Kullanicidan bir kelime isteyin ve kelime sayisini yazdirin
         */

        String str= "Java gittikce zorlasiyor";
        String kelimeler [] = str.split(" ");

        System.out.println(Arrays.toString(kelimeler));
        System.out.println("Girilen cumlede " + kelimeler.length + " adet kelime var.");
    }
}
