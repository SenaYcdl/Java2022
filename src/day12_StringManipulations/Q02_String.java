package day12_StringManipulations;

public class Q02_String {
    public static void main(String[] args) {

        //String seklinde verilen asagidaki fiyatlarin toplamini bulunuz

        String str1="$13.99";
        String str2="$10.55";

        String ilk= str1.replace("$","");
        String ikinci=str2.replace("$","");




        double a=Double.parseDouble(ilk);
        double b=Double.parseDouble(ikinci);


        System.out.println(a+b);

    }
}
