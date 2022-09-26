package day05_matematikselIslemler;

public class Q01_Pre {
    public static void main(String[] args) {

        int sayi1 = 10; //sayi1 11 sayi2 10 sayi3 30
        int sayi2 = 20;
        int sayi3 = 30;
        sayi2 = sayi1++;
        sayi3 = ++sayi1; // sayi1 12 sayi2 10 sayi3 12
        System.out.println(sayi1 + " ," + sayi2 + "," + sayi3);

        int s1 = 13;
        int s2 = 16;
        int s3 = 19;

        s2 = s1++; // s2 13 oldu s1 bir artacak
        s3 = s2++; // s2 15 s3 14
        s1 = ++s3; // s3 15 s1 15
        System.out.println(s1 + "," + s2 + "," + s3); // s1 15 s2 15 s3 15

        int x=15;
        int y=x++; //
        System.out.println(y);

    }
}
