package day13_MethodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {

        /*
            String methodlarını kullanarak " Java ogrenmek123 Cok guzel@ "
            Stringini " Java ogrenmek cok guzel." şekline getirin
            */

        String str= "  Java ogrenmek123 Cok guzel@  ";

        str=str.trim(); // Java ogrenmek123 Cok guzel@
        str=str.replaceAll("\\d","");// Java ogrenmek Cok guzel@
        str=str.replace("@",""); // Java ogrenmek Cok guzel
        str=str.replace("C","c"); // Java ogrenmek cok guzel
        str=str+"."; // Java ogrenmek cok guzel.
        System.out.println(str); // Java ogrenmek cok guzel.

    }
}
