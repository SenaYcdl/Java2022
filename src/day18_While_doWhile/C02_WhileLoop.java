package day18_While_doWhile;

public class C02_WhileLoop {
    public static void main(String[] args) {

        /*
		 Soru 7 ) Kullanicidan pozitif bir tamsayi alin
		 ve bu sayinin rakamlari toplamini yazdirin
		 */

        int input=54321;
        int rakamalarToplami=0;
        int birlerBasamagi=0;
        int temp=input;


        while (temp>0) {
            birlerBasamagi = temp % 10;
            rakamalarToplami += birlerBasamagi;
            temp /= 10;
        }

        System.out.println(input + " sayisinin rakamlar toplami: "+ rakamalarToplami);
    }
}
