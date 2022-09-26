package day35_InheritancedaConstructor;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    her class da gorunmese bile bir constructor vardir bu class dan obje olusturmak istedigimizde
    default constructor devreye girecektir
    Default constructor i gozlemleyemeyecegimiz icin onun yerine kullanilabilecek parametresiz
    constructor olusturalim
     */

    protected String grandpaKlupAdi="Grandpa Klubu";

     AGrandParent() {
        System.out.println("Grandpa constructor calisti");
    }
}
