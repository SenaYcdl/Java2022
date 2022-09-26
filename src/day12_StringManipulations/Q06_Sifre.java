package day12_StringManipulations;

public class Q06_Sifre {
    public static void main(String[] args) {

        //kullanicidan sifre girmesini isteyin. asagidaki sartlari sagliyorsa
        //"Sifre basari ile tanimlandi"
        //sartlari saglamazsa "Islem basarisiz lutfen yeni bir sifre girin" yazdirin
        //ilk harf buyuk harf olmali
        //son harf kucuk harf olmali
        //sifre bosluk icermemeli
        //sifre uzunlugu en az 8 karakter olmali

        String sifre="A2345678a";

        if (sifre.contains("A")) {
        } if (sifre.contains("a")) {
        } if ((!sifre.contains(""))) {
        } if (sifre.length() >8 ) {
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz lutfen yeni bir sifre girin");
        }

    }
}
