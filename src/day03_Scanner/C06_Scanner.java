package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Isminizi Giriniz");
        String isim=scan.nextLine(); // string verileri scanner ile alirken next ve nextline kullanilabilir//
        System.out.println("Lutfen SoyISiminizi Giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lutfen Yasinizi Giriniz");
        double yas=scan.nextDouble();
        System.out.println("Girilen Bilglier= "+isim+" "+soyisim+" "+yas);

        //Not= eger artarda birden fazla string alacaksak nextline kullanilir//




    }
}
