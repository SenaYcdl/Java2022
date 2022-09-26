package day17_NestedforLoop;

public class Test03_WhileLoop {
    public static void main(String[] args) {

        //for loop ve while loop kullanarak 3 basamakli sayilardan 15,20,90 a tam boluen sayıları yazdırın


        int baslangic=100;
        int bitis=999;

        for (int i=100; i<=999; i++) {
            if (i%15==0 && i%20==0 && i%90==0) {
                System.out.println("15, 20 ve 90 a bolunen sayilar:" + i);
            }


        }

        int sayi=100;
        while (sayi<=999) {
            if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
                System.out.print(sayi+ " ");
            }
           sayi++;
        }

    }
}
