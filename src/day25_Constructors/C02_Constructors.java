package day25_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructors {
    public static void main(String[] args) {

        C01 obj=new C01();
        //C01 = class adi
        //obj= objenin adi
        //new= keyword
        //C01(); = constructor


        Scanner scan = new Scanner(System.in);
        Random rnd= new Random();
        List<String> list= new ArrayList<>();

        // List<String> list2=new List<>();

        /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz
         */

        System.out.println(obj.sayi); // 0
        obj.deneme(); // C01 den deneme method calisir
    }
}
