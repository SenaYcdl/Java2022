package day12_StringManipulations;

public class Q03_String {
    public static void main(String[] args) {

        // soru 3) kullanicidan isim isteyin, eger
        //isim a harfi iceriyorsa "girdiginiz isim a harfi iceriyor
        //isim Z harfi iceriyorsa  "girdiginiz isim Z harfi iceriyor
        //ikisi de yoksa "Girdiginiz isim a veya Z harfi icermiyor yazdirin

        String str="Javsi hyt cok zor";

        if (str.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } if (str.contains("z")) {
            System.out.println("Girdiginiz isim z harfi iceriyor");
        } if ((!str.contains("a") && !str.contains("z"))) {

            System.out.println("Girdiginiz isim a veya z harfi icermiyor");
        }

    }
}
