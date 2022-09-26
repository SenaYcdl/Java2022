package day25_Constructors;

public class CarRunner {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilglileri\nMarka : " + car1.marka + "\n" +
                           "Model: " + car1.model + "\n" +
                            "Yil :" + car1.yil + "\n" +
                            "Fiyat :" + car1.fiyat );


        System.out.println(" ");
        Car car2=new Car();
        System.out.println("Car2 bilglileri\nMarka : " + car2.marka + "\n" +
                "Model: " + car2.model + "\n" +
                "Yil :" + car2.yil + "\n" +
                "Fiyat :" + car2.fiyat );

        /*
        her hangi bir obje uzerinden bir variable yazdirmaya calistigimizda java degeri su siralama ile arar
        1-o bje olusturulduktan sonra bir deger atandi mi?
        2-objenin olustruldugu class da variable a bir deger atanmis mi?
        3-o zaman data turune gore java default degeri atar
         */


    }
}
