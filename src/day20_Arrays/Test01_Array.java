package day20_Arrays;

import java.util.Arrays;

public class Test01_Array {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6};

        //Array in tamamini Arrays.toString() seklinde yazdirirken
        //tum elementlerini ise for veya for each ile yazdirabiliriz
        System.out.println(Arrays.toString(arr)); //  [1, 2, 3, 4, 5, 6]

        for (int i=0; i<arr.length; i++) {  //Array in length inde () yer almaz
            System.out.print(arr[i]+ " "); // 1 2 3 4 5 6
        }


        System.out.println(" ");
        String [] meyveler={"cilek", "karpuz", "kiraz"};
        System.out.println(Arrays.toString(meyveler)); // [cilek, karpuz, kiraz]


        String [] renkler={"siyah","sari","mavi","turuncu"};
        for (int i=0; i<renkler.length; i++) {
            System.out.println(renkler[i]);
        }

    }
}
