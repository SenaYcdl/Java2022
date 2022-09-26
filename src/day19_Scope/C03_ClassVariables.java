package day19_Scope;

public class C03_ClassVariables {
    public static void main(String[] args) {

        /*
        Farkli bir class ta calisirken herhangi bir class adini yazip noktaya basarsak
         adini yazdigimiz class daki tum Static class uyelrini gorebilir ve kullanabilirz
         */


        C02_StaticVariables.staticMethod(); //10
        System.out.println(C02_StaticVariables.staticsayi); //10
        System.out.println(C02_StaticVariables.degersizStaticVariable); //0

        /*
        calss level variable lari deger atayip atamamak bize kalmistir
        istersek deger atamasi yapariz
        istemezsek deger atamayiz
        eger deger atamissak java atadigimiz degeri kabul eder
        deger atamassak java bu variable lara default bir deger atamasi yapar
        default atamalari
        int=0
        String=null
        boolean=false
        char='' hiclik bos bir satir


         */


        /*
        baska class daki instance variable lara obje olusturarak ulasabilirz

         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod(); //10
        //bu method icinde static sayi 20 oldu
        System.out.println(obje1.isim); //mehmet
        System.out.println(obje1.degersizInstanceVariable); //0

        System.out.println(C02_StaticVariables.staticsayi); //20

        /*
        Farkli bir class dan C02 classindan method ve variable lari kullandigimda C02 classinin tamami degil
        sadece cagirdigimiz kismin class uyeleri calisir

         */

    }
}
