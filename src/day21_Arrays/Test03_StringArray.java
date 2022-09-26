package day21_Arrays;

public class Test03_StringArray {
    public static void main(String[] args) {

        /*
        Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran
        bir method
               olusturun
         */


        String [] arr= {"Sena", "Yucedal"};
        EnuzunEnKisa(arr);

    }

    public static void EnuzunEnKisa(String[] arr) {

       String enUzun = arr[0];
       String enKisa= arr [0];

       for (int i=0; i<arr.length; i++) {
           if (arr[i].length() > enUzun.length()) {
               enUzun=arr[i];
           }
           if (arr[i].length() < enKisa.length()) {
               enKisa=arr[i];


           }
       }

        System.out.println("En uzun kelime: " + enUzun );
        System.out.println("En kisa kelime: "  + enKisa);

    }


}
