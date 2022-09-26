package day34_Inheritance;

public class ToyotaCorolla extends Toyota{
    public static void main(String[] args) {


        /*
        child classdan parent class a erisimde access modifier kurallarini bypass
        edemeyiz ornegin parent class daki private class uyelerini child class dan kullnamayiz
        ayni sekilde parent ve child farkli package larda ise parent class daki
        default access modifier i olan class uyelerini child classdan kullanamayiz
         */
        ToyotaCorolla araba1=new ToyotaCorolla();
        System.out.println(araba1.marka); // Toyota
        System.out.println(araba1.model); // Model belirtilmedi
    }
}
