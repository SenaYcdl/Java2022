package day09_ternary;

import java.util.Scanner;

public class Q02_Ternary {
    public static void main(String[] args) {

        //kullanicidan bir tamsayi alin ve sayinin
        //tek veya cift olduguu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        String sonuc= sayi%2==0 ? "cift sayi" : "tek sayi";
        System.out.println(sonuc);
    }
}
