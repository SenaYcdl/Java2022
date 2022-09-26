package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {

        /*
        Immutable : degistirilemez
        Mutable : degistirilebilir

        en meshur immutable class: String

         */

        String str="Yildiz Bank"; // str string classindan olusturulumus bir objedir
        System.out.println(str.toUpperCase()); //YILDIZ BANK

        str.toLowerCase();
        System.out.println(str); // Yildiz Bank

        str.substring(3,5); // sout olmadigindan yzdrimaz, di

        System.out.println(str); // Yildiz Bank

        //Java da string gibi metin ifadelerde kullanabilecegimiz mutable
        //String Builder  classi da vardir

        StringBuilder sb= new StringBuilder("Java Bank");
        System.out.println(sb);  // Java Bank

        sb.reverse();
        System.out.println(sb); // knaB avaJ

        sb.append(".");
        System.out.println(sb); // knaB avaJ.




    }
}
