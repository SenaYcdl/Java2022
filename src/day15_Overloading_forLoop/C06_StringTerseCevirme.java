package day15_Overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen String i terse cevirip yazdiran bir method olusturun

        String input="Java gun gectikce guzellesiyor";
        tersYazdir(input);

    }

    public static void tersYazdir(String input) {

        String tersInput=input.substring(input.length()-1);
        for (int i=input.length()-2; i>=0; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);
    }
}
