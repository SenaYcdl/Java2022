package day16_forLoop;

import java.util.Scanner;

public class Test04_Palindrome {

    public static void main(String[] args) {

        /*Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
        palindrome olup olmadigini kontrol eden bir program yazin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String kelime=scan.nextLine();
        palindrome(kelime);

    }

    public static void palindrome(String kelime) {

        String yeniKelime="";
        for (int i= (kelime.length()-1); i>=0; i--) {
            yeniKelime+=kelime.charAt(i);

    }
        if (yeniKelime.equals(kelime)) {
            System.out.println("Girilen kelime Palindrome bir kelimedir");
        } else {
            System.out.println("Girilen kelime Palindrome bir kelime degildir");
        }

}
}