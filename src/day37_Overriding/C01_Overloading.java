package day37_Overriding;

public class C01_Overloading {
    public static void main(String[] args) {

        /*
        Bir class da ayni isimde ve ayni signature a sahip iki method OLMAZ
        Ayni class da birden fazla method olusturmak istersek mutlaka signature a
        degistirmeliyiz

        Frkli class larda ayni isim ve signature a sahip iki method olabilir mi?
        tabiki olur
         */

    }

    void ekleme(){

    }

    void ekleme(int sayi) {
    }

    void ekleme(String str) {

    }

    void ekleme(String str, int sayi) {

    }

    void ekleme(int sayi, String str) {

    }
}
