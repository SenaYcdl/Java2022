package day28_StaticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
       Static Block class uyelerinin tamamaindan once calisir
       (main methoddan bile once )

       Static Block class olusturuldugunda calisir genellikle class la ilgili on ayarlamalar
       veya static variable lara deger atamak icin kullanilir

       static blocklarin class icerisinde nerede olduklari onemli degildir
       once static block lar calisir
       birden fazla static block olursa yukaridan asagi dogru calisir
         */
        System.out.println("Static Block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("Main Method calisti");
        System.out.println(sayi); // 0
    }

    static {
        System.out.println("Main method altindaki Static class calisti");

    }
}
