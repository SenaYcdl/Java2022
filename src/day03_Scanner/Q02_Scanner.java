package day03_Scanner;

import java.util.Scanner;

public class Q02_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(3);
        System.out.println("isminizin \nson harfi:"+ ilkHarf);

    }
}
