package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Ilk Sayiyi Girin");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen Ikinci Sayiyi Girin");
        double sayi2=scan.nextDouble();

        System.out.println("Girilen Sayilarin Carpimi: "+sayi1*sayi2);
    }
}
