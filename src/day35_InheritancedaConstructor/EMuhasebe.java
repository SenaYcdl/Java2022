package day35_InheritancedaConstructor;

public class EMuhasebe extends DPersonel {

     EMuhasebe() {
         System.out.println("Muhasebe parametresiz constructor");
    }

    EMuhasebe(String isim) {
        System.out.println("Muhasebe parametreli constructor");
    }
}
