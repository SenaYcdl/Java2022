package day17_NestedforLoop;

import java.util.Scanner;

public class Test06_WhileLoop {
    public static void main(String[] args) {

        /*
		 Soru 7 ) Kullanicidan pozitif bir tamsayi alin
		 ve bu sayinin rakamlari toplamini yazdirin
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi girin");
        int sayi=scan.nextInt();

        int rakam=0;
        int toplam=0;

        while (sayi >0) {
            rakam=sayi%10;
            toplam+=rakam;
            sayi/=10;

        }
        System.out.println("Rakamlar Toplami:" + toplam);
        scan.close();
    }
}
