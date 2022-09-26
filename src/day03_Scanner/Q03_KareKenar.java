package day03_Scanner;

import java.util.Scanner;

public class Q03_KareKenar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Karenin Kenar Uzunlugunu Giriniz");
        double kenar=scan.nextDouble();
        System.out.println("Karenin Cevresi:" + kenar*4);
        System.out.println("Karenin Alani:" + kenar*kenar);

    }
}
