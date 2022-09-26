package day16_forLoop;

public class Test05_CarpmaTablosu {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            for (int j=1 ; j<=10; j++) {

                System.out.print(i + "*" + j + "=" + (i*j) + " ");
            }
            System.out.println();
        }


    }
}
