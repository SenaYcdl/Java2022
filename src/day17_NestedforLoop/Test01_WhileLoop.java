package day17_NestedforLoop;

public class Test01_WhileLoop {
    public static void main(String[] args) {

        /*
        kullanicidan baslangic ve bitis alin ve baslangiz harfinden baslayip bitis harfinde biten tum harfleri
        buyuk harf olarak ekrana yazdirin
        kullanicinin hata yapmadigini farz edin.
         */


        char c = 'a';
        char a='s';


        while (c <= a) {
            System.out.print(Character.toString(c).toUpperCase()+" ");
            c++;
        }
    }
}
