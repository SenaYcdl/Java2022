package day19_Scope;


public class C01_InstanceVariables {


        /*
        class icerisinde her yerden kullanmak istedigimiz variable lari class level
        de (Class in icinde ama methodlarin disinda) genellikle
        class level variable lar class in basinda olusturulur(sart degil)

        class level deki variable lar icin 2 scope vardir
        1-static variables (class variable lari da denir)
        2- instance (static olmayan) variables (obje variable i da denir)=non static
         */

    int instSayi = 20; // static olmayan class level de oldugu icin instance variable dir

    public static void main(String[] args) {
        int sayi = 10;
        /*
        System.out.println(InstSayi);
        instance variables static olmadigi icin static klup e uye main methoddan direk kullnamayiz
        instance variables in diger adi object variables dir
        dolayisiyla obje olusturursaniz instance variable lari heryerden kullanabiliriz

         */

        C01_InstanceVariables obje1 = new C01_InstanceVariables();
        System.out.println("obje1 degismeden once:" + obje1.instSayi); //20
        obje1.instSayi = 30;
        System.out.println("obje1 degistikten sonra:" + obje1.instSayi); //30


        C01_InstanceVariables obje2 = new C01_InstanceVariables();
        System.out.println("obje2 degismeden once:" + obje2.instSayi); //20
        obje2.instSayi = 25;
        System.out.println("obje2 degistikten sonra:" + obje2.instSayi); //25


        C01_InstanceVariables obje3 = new C01_InstanceVariables();
        System.out.println("obje3 degismeden once:" + obje3.instSayi); //20
        obje3.instSayi = 15;
        System.out.println("obje3 degistikten sonra:" + obje3.instSayi); //15

        /*
         Her obje olustugunda instance (obje) variable'inin ilk atanan degerini alir
         */

    }

    public static void staticMethod() {
        // System.out.println(sayi);
        /*
         bir method'un icerisinde olusturulan variable,
         sadece o method'un icinden kullanilabilir
         (Local variables)
         */
        /*
        instSayi=30;
        instance variable'lara main method disindaki static method'lardan da
        direk ulasamayiz
        obje olusturursak ulasabiliriz
         */
        C01_InstanceVariables obje4 = new C01_InstanceVariables();
        System.out.println(obje4.instSayi);
    }

    public void staticOlmayanMethod() {
        System.out.println(instSayi);
        /*
         instance variable'lar class icerisindeki
         static olmayan method'lardan direk kullanilabilir
         */
    }
}