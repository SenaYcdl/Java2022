package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_1_Test_Modulus {
    public static void main(String[] args) {

        int a= 15%4;
        System.out.println(a);

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz"); //245
        int sayi=scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilensSayi=0;

        birlerBasamagi=sayi%10; //5
        rakamlarToplami+=birlerBasamagi; // 5
        sayi/=10; // 24

        birlerBasamagi=sayi%10; // 4
        rakamlarToplami+=birlerBasamagi; //5+4=9
        sayi/=10; // 2

        birlerBasamagi=sayi%10; // 2
        rakamlarToplami+=birlerBasamagi; // 9+2
        sayi/=10;

        System.out.println("Sayinin rakamlar toplami:" + rakamlarToplami);











    }
}
