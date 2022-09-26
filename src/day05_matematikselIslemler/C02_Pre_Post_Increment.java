package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println("pre-increment:" +  ++sayi); //arttirma islmei once oldugu icin pre, once arttirip sonra
        //yazdiricak

        System.out.println("post-increment:" +  sayi++); //arttirma islemi sonra oldugu icin post, once arttirma yapip
        // sonra yazdiricak

        System.out.println("post-increment den sonra:" + sayi);




    }
}
