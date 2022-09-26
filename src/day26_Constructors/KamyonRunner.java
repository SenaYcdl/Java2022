package day26_Constructors;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("Kamyon1 ozellikleri " + kamyon1.toString());

        System.out.println("");

        Kamyon kamyon2=new Kamyon("Mercedes","4140",2005,50000);
        System.out.println("Kamyon2 ozellikleri " + kamyon2.toString());

        System.out.println("");

        Kamyon kamyon3=new Kamyon("Man","as900",2007,40000);
        System.out.println("Kamyon3 ozellikleri " + kamyon3);

        System.out.println("");

        Kamyon kamyon4=new Kamyon("Scania", "S540");
        System.out.println("Kamyon4 ozellikleri " + kamyon4);
    }

}
