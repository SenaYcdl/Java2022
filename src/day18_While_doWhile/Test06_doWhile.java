package day18_While_doWhile;

import java.util.Scanner;

public class Test06_doWhile {
    public static void main(String[] args) {


        /* soru 6)
        kullanicidan toplamak icin sayi isteyin ve toplam 500 e ulasincaya kadar
        devam etmeyi isteyin.
        toplam 500 e ulastiginda veya gectiginde toplami ve kac sayi girdigini yazdirin

         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayac=0;



        do{
            System.out.println("Sayi giriniz:");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
            sayi++;


        }while(toplam<=500);
        System.out.println(sayac + " sayi girdiniz ve toplamlari: "+ toplam);

    }
}
