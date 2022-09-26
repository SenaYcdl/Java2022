package day12_StringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2Gu3n Ja*va- cok g3uz/el";

        //str i bugun Java cok guzel haline getirin
        // replaceAll methodundaki All un amaci ayni ozellikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //butun ozel karakterleri sil
        // tum ozel karakterleri silelim dedigimizde space lerde siliniyor
        //sapce leri korumak icin en basta onlarin yerine cumlede bulunmayacak bir string koyalim
        //"qazwsx"

        str=str.replace(" ", "qazwsx");
        System.out.println(str);

        str=str.replaceAll("\\W", "");
        System.out.println(str);

        str=str.replaceAll("\\d","" ); //istenmeyen ozel karakter ve sayilardan kurtulduk
        //simdi space leri geri getirelim
        str=str.replace("qazwsx", " ");
        System.out.println(str);


    }
}
