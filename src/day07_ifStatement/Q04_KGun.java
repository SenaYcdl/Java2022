package day07_ifStatement;

import java.util.Scanner;

public class Q04_KGun {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        else if(gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        } else {
            System.out.println("Kutsal gun degildir");}


    }
}
