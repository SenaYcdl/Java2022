package day07_ifStatement;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Q02_GunIsimleri {
    public static void main(String[] args) {

        //kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
        //baslayan gun isimlerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        char ilkharf=scan.next().charAt(0);

        if (ilkharf== 'p' || ilkharf== 'P') {
            System.out.println("P harfi ile baslayan gunler: Pazartesi, Persembe, Pazar");
        }
        else if (ilkharf== 's'|| ilkharf== 'S') {
            System.out.println("S harfi ile baslayan gunler: Sali");
        }
        else if (ilkharf== 'c' || ilkharf== 'C') {
            System.out.println("C harfi ile baslayan gunler: Cuma, Cumartesi, Carsamba");
        }
        else {
            System.out.println("lutfen gecerli bir harf giriniz: ");

        }
    }
}
