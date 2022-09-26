package day37_Overriding;

public class DAraba {

    private void yakit() {
        System.out.println("Tum arabalar yakit kullanir.");
        /*
        parent class dan overrride edilmesini istemediginiz methodlari
        private, static veya final yapabilirsiniz
         */
    }

    void marka (){
        System.out.println("Tum arabalarin markasi vardir.");
    }

    void motor(){
        System.out.println("Tum arabalarin motoru vardir.");
    }

}
