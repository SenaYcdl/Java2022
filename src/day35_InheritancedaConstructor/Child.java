package day35_InheritancedaConstructor;

public class Child extends BParent {

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";


     Child() {
         System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

         AGrandParent gp1=new AGrandParent();//bu objeyi olusturmak icin Granpa cons calisir
        //parent veya child cons calismaz

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";
        //child1 objesi icin Child cons calisir
        /*
        java da bir class i kullanabilmek icin
        o class dan obje olusturur, dolayisiyla
        o class in constructor ini kullanirdik

        java inheritance da parent class lardaki
        ozellikleri kullanabilmek icin o class larin constructor larini otomatik
        calistiran bir yapi kurmustur

        ornegin biz child classinda Child classindan bir obje olusturmak istedigimizde Child cons ini kullaniriz

        Java Child(){} gordugunde once parent in const ini calistirmam lazim der
        buradan Parent cons a gider Parent classinda Parent (){} gorunce once bunun
        parentini yani Grandparent const calismasi gerekir der

        boylece extends keyword olmayan class a kadar gider ve oradan baslayarak tum constructorlari
        asagi dogru calistirir
         */


    }
}
