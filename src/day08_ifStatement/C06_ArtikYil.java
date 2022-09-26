package day08_ifStatement;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil=scan.nextInt();

        if (yil%4 !=0){
            System.out.println("Artik yil degil");
        } else if (yil%100 !=0) {
            System.out.println("Artik yil");
        } else if (yil%400 !=0) {
            System.out.println("Artil yil degil");
        } else {
            System.out.println("Artik yil");
        }
    }
}
