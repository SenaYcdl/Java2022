package day20_Arrays;

import java.util.Scanner;

public class Test03_CiftVeTekToplam {
    public static void main(String[] args) {

        /*
        Girilen arraydeki sayilarin cift ve tek olanlarin toplamlarini bulunuz

        input : int arr[] = {45,34,10,7,16,24,100};
         */

        int cift=0;
        int tek=0;

        int[] arr=new int [7];
        Scanner scan=new Scanner(System.in);
        System.out.println("7 sayi giriniz:");

        for (int i=0; i<7; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i=0; i<7; i++) {
            if (arr[i]%2==0){
                cift=cift+arr[i];
            } else
                tek=tek+arr[i];
        }
        System.out.println("Cift sayilar toplami :" + cift);
        System.out.println("Tek sayilar toplami : " + tek);
    }



}
