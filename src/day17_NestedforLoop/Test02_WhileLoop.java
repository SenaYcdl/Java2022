package day17_NestedforLoop;

public class Test02_WhileLoop {
    public static void main(String[] args) {

        // while loop kullanrak 3 ten 13 e kadar olan tum tek sayıları yazdırın


        int a=3;
        int b=13;

        while (a<=b) {
            if (a%2==1) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
