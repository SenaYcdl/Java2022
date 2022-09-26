package day37_Overriding;

public class FSupra extends EToyota{

    void yakit() {
        System.out.println("Supra benzin kullanir");
        /*
        private methodlar override edilemez
        eger child class da parent class daki private method ile ayni signature da
        bir method ollusturusaniz bu overriding method OLMAZ

         */
    }

    @Override
    void motor() {

        /*
        @override notasyonu javaya bir gorev verir
        Java, bu notasyonla birbirine bagli olan iki methodu surekli
        kontrol eder
        eger parent class daki overriden methodu silerseniz CTE verir


       @Override notasyonu kullanmak mecburi degildir
       eger overridding method silinirse kodun CTE vermesini, istersek override
       notasyonu kullanmaliyiz
         */
    }


}
