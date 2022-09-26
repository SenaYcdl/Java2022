package day11_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str="Hava cok guzel";
        System.out.println(str.lastIndexOf("H"));
        System.out.println(str.lastIndexOf('a'));

        String str2="jhasudihfNOPSKDLIWOF";
        // Str2 de s harfi var midir
        if (str2.lastIndexOf("F")==-1) {
            System.out.println("str2 de istenen harf kullanilmamis");
        } else {
            System.out.println("str2 de istenen harf kullanilmis");
        }


    }
}
