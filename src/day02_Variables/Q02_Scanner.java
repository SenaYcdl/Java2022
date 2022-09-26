package day02_Variables;

import java.util.Scanner;

public class Q02_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi=scan.next();
        System.out.println("Merhaba " + kullaniciIsmi + " hanim ");
        System.out.println("Nasilsiniz "+ kullaniciIsmi + " hanim ");
        System.out.println("Yasinizi Giriniz");
        String yas= scan.next();

        System.out.println("Adinizi Soyadinizi Giriniz");
        String AdinizSoyadiniz=scan.next();
        String no= scan.nextLine();
        System.out.println("Telefon Numarasi Giriniz");
        String Numara=scan.next();
        System.out.println("Bitti");

    }
}
