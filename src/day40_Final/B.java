package day40_Final;

final public class B extends A {
    public static void main(String[] args) {

        B obj=new B();
        obj.isim="Ap";

        System.out.println(A.OKUL);


        /*
        bir class final olarak belirlenirse o class
        inherit edilemez(kimse bu class dan faydalanamaz)
         */
    }
}
