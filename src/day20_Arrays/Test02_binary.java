package day20_Arrays;

import java.util.Arrays;

public class Test02_binary {
    public static void main(String[] args) {


        int arr[]={1,3,6,78,90,56,2,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 6, 56, 78, 90]
        // binarySearch bize aradigimiz elemanin indexini dondurur
        //90 rakaminin indexini bulmak istiyoruz
        System.out.println(Arrays.binarySearch(arr,90)); // 90 rakaminin indexi: 7


        String[] arr1 ={"Zeynep", "Ayse", "Veli", "Can"};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); // [Ayse, Can, Veli, Zeynep]
        //Veli isminin indexini bulmak istiyoruz
        System.out.println(Arrays.binarySearch(arr1,"Veli")); // Veli isminin indexi: 2


    }
}
