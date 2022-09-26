package day36_InheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{

    protected int saatUcreti=1;
    protected int gunlukMesai=7;

    protected void maasIsci() {
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
           BMuhasebe isc1=new DIsci();
           /*

           Bir obje olusturulken data turu ve cons ayni class dan ise
           direk o class a gidiyorduk

           eger data turu ve cons farkli ise
          obje const in oldugu class in objesidir ancak bizden istenen
          Isci classindaki spesifik ozellkler degil
          bir iscinin muhasebe classindaki tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir

            */
        System.out.println(isc1.gunlukMesai); //muhasebe classindan alicak 8
        System.out.println(isc1.saatUcreti); // muhasebe classindan alicak 10
        isc1.maas(); // muhasebe classindan alicak
        isc1.ozelSigorta(); // Muhasebe classindan alicak
        isc1.sigorta(); // Parent a gidicek yani personelden alical
        System.out.println(isc1.isim); // personelden alicak
        System.out.println(isc1.soyisim); // personelden alicak
        System.out.println(isc1.departman); // personelden alicak


        APersonel isc2=new DIsci();

        //System.out.println(isc2.gunlukMesai);
        //System.out.println(isc2.saatUcreti);
        //isc2.ozelSigorta();
        isc2.maas(); // Muhasebediki
        isc2.sigorta(); //Personel
        System.out.println(isc2.isim);
        System.out.println(isc2.soyisim);
        System.out.println(isc2.departman);

        /*
        eger data turu olan class da aradigimiz ozellik varsa onun parentina gidebilir ama
        child a donus olmaz
        aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */

    }
}
