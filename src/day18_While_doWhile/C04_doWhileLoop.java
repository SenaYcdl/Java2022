package day18_While_doWhile;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        /*
        kulanicidan tam sayilar alin
        kullanici cift sayi grdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;

        //while ile yapalim
        /*
        loop larda kullancagimiz variable lari loop tan once olusturmaliyiz
        while loop ta ,loop tan once olusturdugumuz bu variable a atayacagimiz degeri iyi
        dusunmemiz gerekiyor
         */

        while (sayi%2==0) {

            System.out.println("Tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
                System.out.println("Girilen sayi cift: " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar!");
            }

        }

        //do while loop ile yapalim
        //do while loop da onceden olusuturulan variable a hangi  deger atandiginin hicbir onemi yok
        //kodumuz her durumda calisir

        /*
        do while in dezvantaji:
        ilk calistirma kontrol yapilmadan yapildigi icin
        loop un body sinde yanlis yapilmamasina dikkat etmek gerekir
         */

        do{

            System.out.println("Tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
                System.out.println("Girilen sayi cift: " + sayi);
            } else {
                System.out.println("Girilen sayi tek, benden bu kadar!");
            }

        } while (sayi%2==0);

        }
    }

