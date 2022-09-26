package day08_ifStatement;

import java.util.Scanner;

public class C02_IfElseIfStatement01 {
    public static void main(String[] args) {

        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        //50’den kucukse "D",
        // 50-60 arasi "C",
        // 60-80 arasi "B",
        // 80’nin uzerinde ise "A"
        //gecersiz not girildiginde uyari verelim

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir not giriniz");
        double not=scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (not<50) {
            System.out.println("Notunuz: D");
        } else if (not<60) {
            System.out.println("Notunuz: C");
        } else if (not<80) {
            System.out.println("Notunuz: B");
        }  else {
            System.out.println("Notunuz: A");
        }




    }
}
