package day33_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        //arb1 objesi uzerunden marka variable ina ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        /*
        access modifier kullanarak marka variable in ulasimi tamamen serbest yapabilir
        veya tamamen engelleyebiliriz
        private yaptigimiz modele ise hic ulasamayiz
        yani access modifier ya hep ulasabilrisin ya hep degistirisin ya da hic ulasamassin, hic degistiremzsin
         */

        /*
        modeli  degistirelim ama goremeyelim
        yakitida gorelim ama degistiremeyelim
         */

        /*
        set ve get yetkilerini ozel olarak tanimlamak isterseniz
        1.adim= ozel yetki tanimlayacaginiz variable lari private yapin
        private bir dataya baska class lardan ulasmak mumkun olmadigindan
        2.adim= set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim
         */

        arb1.setModel("Corolla"); // model olarak corolla yi atadik
        //model i yazdirma imkanimiz yok cunku getter methodu yok
        System.out.println(arb1.getYakit()); // yakit olarak alektrikli bilgisini yazdiralim
        //yakiti degistiremeyiz cunku setter methodu yok

    }
}
