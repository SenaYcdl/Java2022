package day05_matematikselIslemler;

public class C02_1_Test_Pre_Post {
    public static void main(String[] args) {

        int sayi=8;
        System.out.println("post incrementten once:" + sayi++); // sayi dan sonra ++ geliyorsa post inrecement olur
        System.out.println("post incrementten sonra:" + sayi);   // yani once sayi yazilir sonra islem yapilir

        int sayi1=7;
        System.out.println("pre increment:" + ++sayi1);
        System.out.println("pre decrement:" + --sayi1);
        System.out.println("post decrementten once:" + sayi1--);
        System.out.println("post decrementten sonra:" + sayi1);

        int sayi2=3;
        System.out.println("pre decrement:" + --sayi2);



    }
}
