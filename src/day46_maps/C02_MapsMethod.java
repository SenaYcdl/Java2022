package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethod {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);


        //value leri sira numarali olarak yazdirin

        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        // isim ve soyisimlerin birlikte olacagi bir liste olusturun

        List<String> sinifisimSoyisimList= ReusableMethods.isimSoyisimListesiOLustur(ogrenciMap);
        System.out.println("Isim soyisim Listesi: " + sinifisimSoyisimList);

        //kac farkli brans varsa bransIsmi: brastakiOgrenciSayisi seklinde yazdirin

    }
}
