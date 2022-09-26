package day11_StringManipulations;

public class C01_Indexof {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        //verilen bir String de herhangi bir String veya char in ilk kullandigi
        //index i dondurur

        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j")); //-1

        System.out.println(str.indexOf("mek"));

        //eger istedigimiz index ten sonrasini kontrol etmek istersek
        // o zaman ayni method u iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g", (6 + 1))); //yazilan index ten baslar

        //yukaridaki str da 2. ve 3. e nin indexlerini bulun
        //2. e yi bulabilmek icin 1. e nin indexine ihtiyacim var

        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);

        //eger 2. e varsa 3. e nin olup olmadigini ve varsa indexinin yazdiiralim

        if (ikincie == -1) {
            System.out.println("verilen str da 2. e yok");
        } else {
            int ucuncue = str.indexOf("e", ikincie + 1);
            if (ucuncue == -1) {
                System.out.println("verilen str da 3. e yok");
            } else {
                System.out.println("verilen str daki 3. e nin indexi:" + ucuncue);
            }
        }


    }
}
