package day19_Scope;

public class C02_StaticVariables {

    static int staticsayi = 10;
    String isim="Mehmet";

    static int degersizStaticVariable;
    int degersizInstanceVariable;

    /*
    class level daki variable lara deger atamasakda java kabul ediyor

     */


    public static void main(String[] args) {
         /*
    bir variable static olusturulduysa objeler icin degil
    class icin gecerlidir
     */
        System.out.println(staticsayi); //10
        staticMethod();
        staticsayi=12;
        System.out.println(staticsayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticsayi); //20
        /*
        instance bir variable in degerini bulmak icin objenin olusturulmasindan itibaren istenen satira kadar
        kodu takip etmeliyiz

        static variable da ise classin en basindan baslayarak istenen satira kadar kodu takip
        edip static variable in son degerini bulmamaiz gerekir
         */
    }

    public static void staticMethod() {
        System.out.println(staticsayi); //10

    }

    public void staticOlmayanMethod () {
        /*
        static variable lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum methodlar static variable lari gorebilir ve degistirebilir
        farkli methodlarda static variable in hangi degeri alacagini bilmek istiyorsak
        class in basindan itibaren kodun calismasini takip etmeliyiz
        method ne zman cagrilirsa o anki static variable degerini method da kullanabiliriz
         */
        System.out.println(staticsayi); //12
        staticsayi=20;


    }
}
