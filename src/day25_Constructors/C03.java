package day25_Constructors;

public class C03 {

    /*
    proje olusturuken bazi classlar run etmek icin degil variable ve
    method olusturup binlari baska class lardan kullanmak icin olusturulur
     */

    /*
    Default constructor parametresizdir
    goremezsek bile ihtiyac oldugunda calisir

    Class iceriisnde parametreli veya parametresiz herhangi bir constructor
    olusturursak java default constructor i siler
     */

    C03() {

    }

    /*
    OLusturdugumuz parametresiz bu constructor default constructor ile bire bir aynidir
    ama biz olusturdugumuz icin buna default constructor demeyiz
    parametresiz constructor deriz.

     */
    String isim="Etka";

    public void method01() {
        System.out.println("C03 method calisti");
    }
}
