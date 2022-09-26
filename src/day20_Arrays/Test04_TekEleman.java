package day20_Arrays;

import java.util.Arrays;

public class Test04_TekEleman {
    public static void main(String[] args) {

        /*
        verilen arrayin bir elemanini yazdirin
         */

        String [] names={"John", "Mary", "Alex","Rose", "Edward"};
        System.out.println(Arrays.toString(names));

        for (int i=0; i<names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println("");
        System.out.println(names[3]);
        System.out.println(names[4]);


        int [] numbers={23,56,89,45,21,38};
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println("");
        System.out.println(numbers[3]);
        System.out.println(numbers[5]);


    }
}
