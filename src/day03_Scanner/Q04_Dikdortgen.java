package day03_Scanner;

import java.util.Scanner;

public class Q04_Dikdortgen {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz");
        double uzunkenar=scan.nextDouble();
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz ");
        int kisakenar=scan.nextInt();
        System.out.println("Lutfen dikdortgenin yuksekligini giriniz");
        double yukseklik= scan.nextDouble();
        System.out.println(uzunkenar*kisakenar*yukseklik);


    }
}
