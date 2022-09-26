package day47_maps;

import day46_Maps.ReusableMethods;

import java.util.Collection;
import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {


         /*
          map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
          map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini doner
          ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak
                      map uzerinde manipulation yapmamiz lazim
           map.get(key) ==> verilen key'e ait degeri dondurur
         */

        Map<Integer,String > sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false
        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisikliklerde kullanamayiz
        //ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        Collection<String> valueCollection= sinifListMap.values();

        for (String each: valueCollection
        ) {
            each=each.replace("JDev","JavaDeveloper");
            System.out.println(each);
        }
        System.out.println(sinifListMap);
    }
}
