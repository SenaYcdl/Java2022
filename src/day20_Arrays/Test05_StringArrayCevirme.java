package day20_Arrays;

import java.util.Arrays;

public class Test05_StringArrayCevirme {
    public static void main(String[] args) {


        String str="Hello World!";
        String [] arr=str.split(", ");
        System.out.println(Arrays.toString(arr)); // [Hello World!]
        String [] arr1=str.split(" ");
        System.out.println(Arrays.toString(arr1)); // [Hello, World!]
        String [] arr2=str.split("");
        System.out.println(Arrays.toString(arr2)); // [H, e, l, l, o,  , W, o, r, l, d, !]


    }
}
