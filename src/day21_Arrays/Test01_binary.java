package day21_Arrays;

import java.util.Arrays;

public class Test01_binary {
    public static void main(String[] args) {

        String [] fruits={"banana",
                          "apple",
                          "pears",
                          "grapes"
        };
        Arrays.sort(fruits);
        for (int i=0; i< fruits.length; i++) {
            System.out.println(fruits[i] + " ");

        }

        System.out.println(Arrays.binarySearch(fruits, "grapes"));

    }
}
