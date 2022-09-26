package day17_NestedforLoop;

import java.util.Scanner;

public class Test04_WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        ve kac tane olduklarini yazdirin
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        int sayac=0;
        int bolenler=1;

        while (bolenler<=sayi) {
            if (sayi%bolenler==0) {
                System.out.print(bolenler+ " ");
                sayac++;
            }
            bolenler++;
        }
        System.out.println("");
        System.out.println(sayi + " sayisinin " + sayac + " adet boleni vardir.");

        scan.close();
    }

}
