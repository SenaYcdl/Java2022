package day08_ifStatement;

import java.util.Scanner;

public class Q01_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.nextLine();
        char ilkharf=sifre.charAt(0);

        if (ilkharf>='A' && ilkharf<='Z') {
            if (ilkharf== 'A') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }
        } else if (ilkharf>='a' && ilkharf<='z') {
            if (ilkharf== 'z') {
                System.out.println("Gecerli sifre");
            } else {
                System.out.println("Gecersiz sifre");
            }
        } else {
            System.out.println("Lutfen ilk karakter icin sadece harf giriniz ");
        }

    }
}
