package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        //kullanicidan bir harf isteyin kucuk harf ise consola kucuk harf yazdirin
        //buyuk harfse consola buyuk harf
        //yoksa giridginiz karakter harf degil yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        String sonuc= (harf>='a' && harf<='z') ? ("Kucuk Harf") :
                ((harf>= 'A' && harf<='Z') ? "Buyuk Harf" : "Gecersiz karakter");

        String sonuc2= harf>='a' && harf<='z' ? "Kucuk Harf" :
                harf>='A' && harf<='Z' ? "Buyuk harf" : "Gecersiz karakter";

        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
}
