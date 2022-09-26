package day18_While_doWhile;

public class C05_doWhileLoop {
    public static void main(String[] args) {

        /*
        soru 1) 9 dan 190 kadar
        7 nin kati olan tum tamsayilari yazdirin

         */

        int bas = 9;
        int bitis = 190;

        int temp = bas;

        //while loop

        while (temp < bitis) {

            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }

        // do while

        System.out.println("");
        temp = bas;
        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;
        }while (temp < bitis) ;
        }
    }


