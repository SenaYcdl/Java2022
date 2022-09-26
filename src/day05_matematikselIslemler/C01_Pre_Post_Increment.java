package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=sayi1+1;
        sayi2+=5;

        // pre veya post increment veya decrement sadece ++ ve -- islemi icindir//
        int sayi3=sayi2++; //1-sayi2 bir artilicak//
        //2-sayi2 degeri, sayi3 e atanacak//

        int sayi4=++sayi1;  //1-sayi1 bir arttilicak
        //2-sayi1 degeri sayi4 e atanacak

        System.out.println("sayi3:" + sayi3);
        System.out.println("sayi2:" + sayi2);

        System.out.println(sayi4);
        System.out.println(sayi1);







    }
}
