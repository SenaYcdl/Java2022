package day38_Exceptions;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {


        /*
kullanicidan carpma icin bir String isteyin
kullanicinin giridigi String sadece sayilardan olusuyorsa
sayiyi 2 ile carpip sonucu yazdirin
Kullanici sayilardan olusmayan bir string girerse
girdiginiz string sayiya cevrilemez yazdirin.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("carpma icin bir string girin");
        String str= scan.nextLine();
        int sayi= 0;


        try {
            sayi=Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiginiz deger sadece rakam icermeli");


        }
        System.out.println("Sayinin 2 ile carpimi: " + sayi*2);
    }
}
