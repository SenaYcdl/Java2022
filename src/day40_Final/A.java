package day40_Final;

public class A {

    protected String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji";

    /*
    bir varibale final olarak tanimlandiysa baska class lardan veya icinde oldugumuz class dan bu
    variable a baska deger atanmasi mumkun degildir

    Madem ki degeri degistirilemiyor genelde static de yaparak bu variable a erisim kolaylastirilabilir
    ve genelede static final olarak belirlenen variable isimleri buyuk harfle yazilir
     */

    final void finalMethod(){
        System.out.println("Final method override edilemez");

        /*
        bir methodu final olarak isaretlerseniz
        bu method degistirilemez demektir
        (override edilemez)
         */
    }
}
