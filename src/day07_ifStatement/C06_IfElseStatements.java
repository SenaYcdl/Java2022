package day07_ifStatement;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        // kullaniciya yasini sorun eger 65 den kucukse emekli olamazsin, calismalisin
        //65 e esit veya buyukse emekli olabilirsin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();

        if (yas<65) {
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }


    }
}
