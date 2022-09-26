package day07_ifStatement;

import java.util.Scanner;

public class Q05_Ucgen {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin bir kenar uzunlugunu giriniz");
        double a=scan.nextDouble();
        System.out.println("Ikinci kenar uzunlugunu giriniz");
        double b=scan.nextDouble();
        System.out.println("Ucuncu kenar uzunlugunu giriniz");
        double c=scan.nextDouble();

        if (a==b || b==c || c==a) {
            System.out.println("Eskenar ucgendir");
        } else
            System.out.println("Eskenar ucgen degildir");


    }

}

