package day35_InheritancedaConstructor;

public class GToyota {

     GToyota() {
         System.out.println("GToyota parametresiz constructor");
    }

    GToyota(String isim) {
         // super(isim); extends olmadidgi icin calismaz
        System.out.println("GToyota parametreli constructor");
    }
}
