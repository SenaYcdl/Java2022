package day12_StringManipulations;

public class Q05_String {
    public static void main(String[] args) {

        //kullanicidan 4 harfli bir kelime isteyin
        //ve girilen kelimeyi tersten yazdirin

        String str = "Sena";
        String ters = str.substring(3) +
                str.substring(2, 3) +
                str.substring(1, 2) +
                str.substring(0,1);

        System.out.println(ters);




    }
}
