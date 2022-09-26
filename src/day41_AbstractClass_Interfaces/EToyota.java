package day41_AbstractClass_Interfaces;

public abstract class EToyota extends DAraba{

    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    parent class daki standart belirleyici methodlar (abstract method)larin
    tamami child class tarafindan override edilmelidir

    concrete methodlarin override edilme mecburiyeti
    yoktur istersek override edebiliriz, istemezsek etmeyiz

    aslinada Toyota class i da obje uretebilecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz Toyota class inida abstract yapmaniz
    guzel olur

     */
}
