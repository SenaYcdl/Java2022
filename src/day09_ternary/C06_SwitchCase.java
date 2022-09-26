package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //soru 5)kullanicidan gun ismini alin haftaici veya haftsonu
        //oldugunu yazdirin

        String input = "pazar";
        input=input.toLowerCase();

        switch (input) {
            case "pazartesi":
            case "carsamba":
            case "persembe":
            case "cuma":
            case "sali":
                System.out.println("haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");



        }

    }
}
