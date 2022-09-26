package day17_NestedforLoop;

import java.util.Scanner;

public class Test05_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana yazdirirn

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
        int rakam = scan.nextInt();
        int rakam1=rakam;

        int i = 1;

        while (i<=10) {

            System.out.print(rakam1 + "x" + i + "=" + rakam1*i + " ");

            i++;

        }
        scan.close();
    }

    }

