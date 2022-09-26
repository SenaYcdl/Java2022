package day27_StaticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
        class levelda iki tur variable olusturabiliriz
        static(class) variables
        instance (obje) variables
        static variablelar tum class dan kullanilabilir iken instance olanlar static olmayan methoddan kullanilabilir
        instance variablelara static methoddan ulasmak istersek obje olusturmamiz gerekir


        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.
        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.

         */

        C01 obj1=new C01();
        System.out.println("obj1 in rakam degeri :" + obj1.rakam); //5
        System.out.println("obj1 in sayi degeri :" + sayi); //10

        obj1.rakam+=1; //5+1
        sayi+=1; //10+1

        System.out.println("1 arttirdiktan sonra obj1 in rakam degeri: " + obj1.rakam); //6
        System.out.println("1 arttirdiktan sonra obj1 in sayi degeri: " + sayi); //11

        C01 obj2=new C01();

        System.out.println("obj2 in rakam degeri: " + obj1.rakam); //5
        System.out.println("obj2 in sayi degeri: " + obj2.sayi); //11

        obj2.rakam++; // 5+1
        obj2.sayi++; //11+1

        System.out.println("1 arttirdiktan sonra obj2 in rakam degeri: " + obj2.rakam); // 6
        System.out.println("1 arttirdiktan sonra obj2 in sayi degeri: " + obj2.sayi); // 12
    }
}
