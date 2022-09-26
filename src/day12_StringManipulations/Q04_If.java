package day12_StringManipulations;

public class Q04_If {
    public static void main(String[] args) {

        //kullanicidan isim ve soyismi isteyin
        //ve hangisinin daha uzun oldugunu yazdirin

        String isim="Sena";
        String soyisim="Yucedal";

        if (isim.length() > soyisim.length()) {
            System.out.println(isim);
        } else {
            System.out.println(soyisim);
        }
    }
}
