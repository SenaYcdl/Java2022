package day09_ternary;

import java.util.Scanner;

public class Q01_Ternary {
    public static void main(String[] args) {

        //kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2=scan.nextInt();

        System.out.println((sayi>sayi2) ? sayi2 : sayi);



    }


}
