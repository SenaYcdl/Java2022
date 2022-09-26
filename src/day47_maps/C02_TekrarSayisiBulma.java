package day47_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        // Verilen bir String deki kullanilan harfleri ve kullanilan harflerin tekrar
        //sayisini H=20 seklinde yazdirin

        String str= "Heeeeellllooooo Woooorrrrllllllddddd.";
        //space leri saymasin
        str=str.replaceAll("\\W","");
        String [] harflerArr=str.split("");
        System.out.println(Arrays.toString(harflerArr));

        //harfleri key, kullanim adedini value yapalim bir map olusturalim

        Map<String,Integer> harfKullanimSayilariMap=new TreeMap<>();

        Integer harfkullanimSayisi;
        for (String each: harflerArr
             ) {
            if (!harfKullanimSayilariMap.containsKey(each)) {
                harfKullanimSayilariMap.put(each,1);
            } else {
                harfkullanimSayisi=harfKullanimSayilariMap.get(each);
                harfKullanimSayilariMap.put(each,++harfkullanimSayisi);
            }
        }

        System.out.println(harfKullanimSayilariMap);
    }
}
