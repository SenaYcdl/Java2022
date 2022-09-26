package day07_ifStatement;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);
        System.out.println(a<0 && b<20 && c>=b); //ilk islem false olduktan sonra digerlerinin true olmasinin anlami yok
         /* java and operatoru konunda bize iki secenek sunar
         && kullanirsak, ilk false buldugunda,artik sonucu false yapar
         & kullanirsak tum sartlari kontrol eder sonra sonucu belirler
        */



    }
}
