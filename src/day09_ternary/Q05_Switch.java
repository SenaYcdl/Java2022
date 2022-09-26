package day09_ternary;

import java.util.Scanner;

public class Q05_Switch {
    public static void main(String[] args) {

        //soru 4) kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //kullanici S girerse "Sofware"
        //D girerse "Developer"
        //E girerse "Engineer"
        //T girerse "In Testing" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kisaltma giriniz");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'S':
                System.out.println("Sofware");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");

        }
    }
}
