package day21_Arrays;

import java.util.Arrays;

public class C05_YeniElement {
    public static void main(String[] args) {

       // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun.

        String [] siniflist={"Ali Can" , "Nida Yucedal" , "Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        siniflist=elemanEkle(siniflist,eklenecekIsim);
        System.out.println(Arrays.toString(siniflist));

    }

    public static String[] elemanEkle(String[] siniflist, String eklenecekIsim) {

        String [] yeniSiniflist = new String[siniflist.length+1]; // [null, null, null, null]
        //eski listeden bir eleman fazla uzunlukta yeni bir array olusturduk
        for (int i=0; i<siniflist.length; i++) {
            yeniSiniflist[i]=siniflist[i];

        }

        //oncelikle eski listedeki tum elemanlari,yeni listeye tasidim
        yeniSiniflist[yeniSiniflist.length-1]=eklenecekIsim;
        //son indexe ise eklenecek ismi atadik

        return yeniSiniflist;
    }
}
