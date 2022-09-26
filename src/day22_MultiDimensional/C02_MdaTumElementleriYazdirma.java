package day22_MultiDimensional;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {

        /*
        verilen bir multi dimensional array in tum elementlerini yazdirna bir
        method olusturun
         */

        int [][] sayilar={{1,5,6,9,4} , {2,5,5,8}, {3,1,6}};
        elementleriYazdir(sayilar);

    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i=0; i<sayilar.length; i++){ // i= 0,1,2 degerlerini alacak
            for (int j=0; j<sayilar[i].length; j++){ //inner arraylerin uzunluguna bagladik
                System.out.print(sayilar[i][j] + " ");


            }

        }
    }
}
