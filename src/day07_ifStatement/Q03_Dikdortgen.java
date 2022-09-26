package day07_ifStatement;

import java.util.Scanner;

public class Q03_Dikdortgen {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kenar uzunulugu giriniz");
        int a=scan.nextInt();
        System.out.println("Ikinci kenar uzunlugunu giriniz");
        int b= scan.nextInt();
        System.out.println("Ucuncu kenar uzunlugunu giriniz");
        int c= scan.nextInt();

        if (a==b || b==c || c==a){
            System.out.println("Dikdortgen karedir");
        } else {
            System.out.println("Kare degildir");

        }

    }
}
