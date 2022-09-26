package day12_StringManipulations;

public class Q01_String {
    public static void main(String[] args) {

        //Java ogrenmek123 Cok guzel@ bu stringi Java ogrenmek cok guzel yazdırın

        String str="Java ogrenmek123 Cok guzel@";
        System.out.println(str.replaceAll("\\W", " ").replaceAll("\\d", ""));

        // W harfler ve rakamlar disindaki tum karakterler
        // d rakamlar (0-9)
    }
}
