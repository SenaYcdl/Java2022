package day28_StaticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {

        double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati)); //90
        System.out.println(satisFiyati); //100
        System.out.println(indirimliFiyat(satisFiyati)); //90

        /*
        iki farkli method da satisfiyati isminde varibale olabilir
        java buna itiraz etmez cunku scopelari farklidir

         */


    }

    public static double indirimliFiyat(double orjinalFiyat) {
        //methodumuz %10 indieim yyapip yeni
        //fiyati main methoda dondursun

        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;

    }
}
