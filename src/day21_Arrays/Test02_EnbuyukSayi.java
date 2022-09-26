package day21_Arrays;

public class Test02_EnbuyukSayi {
    public static void main(String[] args) {

        /*
        Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
         */


        int arr [] ={2,4,6,7,8,9,43,33,56};
        enBuyukSayi(arr);

    }

    public static void enBuyukSayi(int[] arr) {

        int buyuk= arr[0];

        for (int i=0; i<arr.length; i++) {
            if(arr[i] > buyuk) {
                buyuk= arr[i];


            }

        }
        System.out.println(buyuk);
    }
}
