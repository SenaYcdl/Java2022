package day39_Exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) throws InterruptedException {

        /*
        Soru: Kullanicidan yasini girmesini isteyin. Kodunuzu kullanici sifirdan kucuk
        bir sayi girerse Exception verecek sekilde yazin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();


        try {
            if (yas<0){
                throw new IllegalArgumentException();
            } else
                System.out.println("Yasiniz: " + yas);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.err.println("Hatali giris yaptiniz, yas negatif olamaz"); //kirmizi yazdirdik
        }

        Thread.sleep(5000); //5 saniye kodu bekletir sonra calismaya devam eder

    }
}
