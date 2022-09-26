package day24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {

        //soru 1) verilen bir arraydeki tekrar eden elementleri yazdirin

        int[] arr={2,3,5,6,7,8,9,3,5,4,9,6,5,5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> tekrarEdenler=new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                tekrarEdenler.add(arr[i]);
            }

        }


    }
}
