package day17_NestedforLoop;

import java.util.Scanner;

public class Test_Beyza {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scan.nextInt();


        int bas=1;
        int toplam=0;

        while (bas<=sayi) {
            if (sayi%bas==0){
                System.out.print(bas+" ");
                toplam++;
            }
            bas++;
        }

        System.out.println(" ");
        System.out.print(sayi+" sayisinin "+ toplam +" adet boleni var");
        scan.close();
    }
}
