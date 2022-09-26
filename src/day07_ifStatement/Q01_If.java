package day07_ifStatement;

import java.util.Scanner;

public class Q01_If {
    public static void main(String[] args) {

        //kullanicidan bir tamsayi isteyiniz ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0) {
            System.out.println( "Girilen sayi cifttir");
        } else {
            System.out.println("Girilen sayi tektir");
        }


    }
}
