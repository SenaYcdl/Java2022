package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin
        //sayi pozitifse "Sayi Pozitif" yazdirin
        //negatifse sayinin karesini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        //eger ternary icindeki sonuclar farkli data turlerinde ise
        //atama yapamayiz sadece yazdirabiliriz

        System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));

    }
}
