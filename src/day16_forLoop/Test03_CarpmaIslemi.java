package day16_forLoop;

import java.util.Scanner;

public class Test03_CarpmaIslemi {
    public static void main(String[] args) {

        //kullanicidan pozitif bir rakam girmesini isteyin
        //ve girilen rakama gore carpım taplosu olusturun
        //orn kullanici 3 girerse 3 6 9


        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(sayi+ "*"+i+ "="+ sayi*i);
        }
    }
}
