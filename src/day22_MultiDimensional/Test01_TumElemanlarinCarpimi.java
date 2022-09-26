package day22_MultiDimensional;

public class Test01_TumElemanlarinCarpimi {

    public static void main(String[] args) {

        /*
        soru 1) asagidaki multi dimensional arrayin tum elemanlarinin carpimini
        ekrana yazdiran bir method yaziniz
        {{1,2,3}, {4,5,6}};

         */

        int [] [] arr = {{1,2,3}, {4,5,6}};
        TumElemanlarinCarpimi(arr);


    }

    public static void TumElemanlarinCarpimi(int[][] arr) {

        int carpim=1;

        for (int i =0 ; i < arr.length; i++) {
            for ( int j = 0 ; j < arr[i].length ; j++ ) {
                carpim*=arr[i][j];


                }
            }

        System.out.println("Tum sayilarin carpimi : "  + carpim);

        }
    }

