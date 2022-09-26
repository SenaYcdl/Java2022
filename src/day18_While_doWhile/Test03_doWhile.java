package day18_While_doWhile;

import java.util.Scanner;

public class Test03_doWhile {
    public static void main(String[] args) {

        /*
        soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.

         Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini
         ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin

         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayilar=0;
        int pozSayilarToplami=0;

        do {
            System.out.println("Pozitif sayi giriniz");
            sayi=scan.nextInt();
            if (sayi>0) {
                pozSayilarToplami+=sayi;
                pozSayilar++;
            }


        }while (sayi!=0); {
            System.out.println(pozSayilar+ " adet pozitif sayi girdiniz,toplamlari: " + pozSayilarToplami);

        }
    }
}
