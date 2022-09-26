package day11_StringManipulations;

public class C078_startsWith {
    public static void main(String[] args) {

        String input= "Java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun", 5));




    }
}
