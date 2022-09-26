package day09_ternary;

import java.util.Scanner;

public class Q04_Switch {
    public static void main(String[] args) {

        //soru 3) kullanicidan bir sayi girmesini isteyin
        //girilen sayi 10 ise "iki basamakli en kucuk sayi"
        //100 ise "uc basamakli en kucuk sayi"
        //10000 ise "dort basamakli en kucuk sayi"
        //diger durumlarda "Girdigin sayiyi degistir"

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        switch (sayi) {
            case 10:
                System.out.println("Iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");
        }

    }
}
