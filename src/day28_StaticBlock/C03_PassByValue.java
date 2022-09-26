package day28_StaticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %25 indirimli fiyati heasplayip bize donduruen bir method olusturun

         */

        double satisFiyati=100;
        double indirimOrani=50;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("Indirimli Fiyat: " + indirimliFiyat);
        System.out.println("Indirimli Fiyat: " + indirimliFiyat);
        System.out.println("Indirimli Fiyat: " + indirimliFiyat);
        System.out.println("Indirimli Fiyat: " + indirimliFiyat);


    }
    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani){//buraya hangi ismi yazmamizin onemi yok
                                                                                    // java her turlu yukardaki value yi getirir

        double indirimliFiyat=satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;
    }
}
