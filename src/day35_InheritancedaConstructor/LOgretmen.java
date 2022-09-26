package day35_InheritancedaConstructor;

public class LOgretmen {

    LOgretmen (){

        System.out.println("LOgretmen parametersiz constructor");
    }

    LOgretmen (String isim) {
        this();
        System.out.println("LOgretmen parametereli constructor");
    }


}
