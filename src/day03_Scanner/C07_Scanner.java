package day03_Scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminzi,soyisminizi ve yasinizi giriniz \naralarda enter tusuna basiniz");

        String isim=scan.nextLine();
        System.out.println();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("Girilen Bilgliler= "+isim+", "+soyisim+", "+yas);


    }
}
