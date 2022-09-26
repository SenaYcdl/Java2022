package day18_While_doWhile;

public class Test01_doWhile {
    public static void main(String[] args) {

        /*soru 1) 9 dan 190 kadar
        7 nin kati olan tum tamsayilari yazdirin

         */

        int baslangic=9;

        do {
            if (baslangic%7==0) {
                System.out.print(baslangic+ " ");
            }

            baslangic++;
        } while (baslangic<=190); {

        }

    }
}
