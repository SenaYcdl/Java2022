package day35_InheritancedaConstructor;

public class HCorolla extends GToyota{

    HCorolla() {
        System.out.println("HCorolla Parametresiz constructor");
    }

    HCorolla(String isim) {
        super(isim);
        System.out.println("HCorolla Parametreli constructor");
    }
}
