package day18_While_doWhile;

import java.util.Scanner;

public class Test04_doWhile {
    public static void main(String[] args) {

        /*

        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.

        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
        “Negatif sayi giremezsiniz” yazdirip basa donun

        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.


         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifSayiAdedi=0;
        int pozToplam=0;
        int negaSayiAdedi=0;


        do {
            System.out.println("Bir sayi giriniz:");
            sayi=scan.nextInt();

            if (sayi>0) {
                pozToplam+=sayi;
                pozitifSayiAdedi++;

            } else if (sayi<0) {
                negaSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");

            }


        } while (sayi!=0);
            System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, toplamlari: " + pozToplam);
            System.out.println(negaSayiAdedi + " adet negatif sayi girdiniz, fakat toplama dahil edilmedi.");








    }
}
