package day03_Scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        int sayi = 10;
        char harf = 'a';
        String str = "banan";


        System.out.println(sayi + harf);
        System.out.println(sayi*harf);
        System.out.println(str + harf);
        System.out.println(harf+2);
        System.out.println(str+harf+sayi);
        System.out.println(""+sayi+harf); //basina bir hiclik koyarsak string haline gelir //

        char deger='1';
        System.out.println(deger+harf); // '1' + 'a' = 146 (asciitable degerleri)//


    }
}
