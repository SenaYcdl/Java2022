package day09_ternary;

import java.util.Scanner;

public class Q06_NestedTernary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi = scan.nextInt();

        String sonuc= (sayi<10) ? ("rakam"):
                ((sayi<100) ? "iki bsamakli sayi" : "uc basamakli veya daha buyuk");
        System.out.printf(sonuc);
    }

}
