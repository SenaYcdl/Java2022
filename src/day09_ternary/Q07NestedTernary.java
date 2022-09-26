package day09_ternary;

import java.util.Scanner;

public class Q07NestedTernary {
    public static void main(String[] args) {

        //soru 4) kullanicidan dikdortgenin uzunlugunu ve genisligini alin
        //girilen degerlere gore dikdortgenin kare olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzunlugunu giriniz");
        double uzunluk=scanner.nextDouble();
        System.out.println("Lutfen dikdortgenin genisligini giriniz");
        double genislik=scanner.nextDouble();

        System.out.println(uzunluk==genislik ? "Karedir" : "Dikdortgendir");


    }

}

