package day04_dataCasting;

public class Q01_Widening {
    public static void main(String[] args) {

        byte sayi1=23;
        short sayi2=34;
        int sayi3=sayi1+sayi2;
        float sayi4=sayi2*sayi3;
        double sayi5=sayi4/sayi2;
        sayi5= (double) sayi1*sayi2;
        System.out.println(sayi4);

        int sayi6=3;
        double sayi7=sayi6;
        System.out.println(sayi7);




    }
}
