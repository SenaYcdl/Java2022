package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen iki integer i toplayip sonucunu yazdiran
        // bir method olusturun

        int input1=10;
        int input2=20;


        //method 4 adimda olusturulu
        //1.adim method call
        //2.adim argument eklenmesi gerekiyorsa ekleyelim
        //eger methodun return type i void den farkli olacaksa
        // bir variable olusturup, method call u assign edelim

        topla(input1, input2);

    }

    public static void topla(int input1, int input2) {
        //3.adim method declaration da degistirilmesi gereken bolumleri degistir (accees modifier, return type vb...)
        //4.adim eger return type void disinda bir seyse
        //return keyword u ve donecek degeri hesaplamaliyiz
        System.out.println("Girilen iki sayinin toplami: " + (input1+input2));

        //String Manipulation sorusu
        String str = "Java code yaz";
        System.out.println(str.substring(12));
        System.out.println(str.substring(5, 9));
        System.out.println(str.substring(8, 8)); // hicbirsey yazdirmaz






    }
}
