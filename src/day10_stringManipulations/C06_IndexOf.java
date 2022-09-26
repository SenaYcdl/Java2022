package day10_stringManipulations;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("t")); // bana integer donduruyor
        // int de yok diye bir deger bulunmuyor
        // 0 dersek J nin index idir
        //- bir deger donerse biz aranan String in str da olmadigini anlariz
        //java -1 dondurmeyi tercih etmistir
        String str5="udihdpqewiouhpeq0iekopSOW;KJEWHFDRIO;RFKDE";
        // str5 de p harfi var midir
        if (str5.indexOf("=")==-1) {
            System.out.println("str5 de istenen harf kullanilmamis");
        } else {
            System.out.println("str5 de istenen karakter kullanilmis");
        }

    }
}
