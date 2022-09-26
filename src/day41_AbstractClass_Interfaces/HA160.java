package day41_AbstractClass_Interfaces;

public class HA160 extends FMercedes{

    /*
    abstract parent silsilesinden gelen ilk concrete class parent i olan tum classlardaki
    abstract methodlari concrete hale donusturmek yani override etmek zorundadir

    bu kuralin istisnasi parent class lardan herhangi birinde concrete hale donusturulmus
    abstract methodlardir
     */

    public static void main(String[] args) {

        HA160 araba1=new HA160();
        //concrete bir class dan istedigimiz objeyi uretebiliriz

        FMercedes araba2=new FMercedes();
        //mercedes de concrete

       // EToyota araba3=new EToyota();
        //abstract class lar constructor barindirir ama obje uretemezler
        //toyota classi abstract class oldugundan obje uretilemez

        EToyota araba4=new GCorolla();


        /*
        List<String> list1=new List<String>();
        List<String> list2=new ArrayList<>();

        abstract classin ozelliklerini tasiyan bir obje olustrumak istedigimizde data turunu
        istedigimiz abstract class, constructor i ise child i olan concrete bir class dan seceriz

         */


    }
}
