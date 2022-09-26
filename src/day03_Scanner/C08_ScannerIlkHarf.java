package day03_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz");
        char IlkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin Ilk Harfi: " + IlkHarf);


        System.out.println("Lutfen Iki Isim Giriniz");
        char harf=scan.next().toUpperCase().charAt(1);
        char harf2=scan.next().toUpperCase().charAt(2);
        System.out.println("Isminiz:" + harf);
        System.out.println("Isnimiz:" + harf2 );

        System.out.println("Kedinizin Ismini Giriniz");
        char h1=scan.next().toLowerCase().charAt(2);
        System.out.println("Kedinizin Ismi:" + h1);

    }
}
