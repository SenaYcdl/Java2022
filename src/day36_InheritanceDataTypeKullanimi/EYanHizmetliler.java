package day36_InheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{

    protected int saatUcerti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan Hizmetliler: " + (30*saatUcerti*gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlikSigortasi yaptirilir");
    }

    public static void main(String[] args) {
        /*
        overriding child class daki bir methodun parent class daki ayni isimndeki
        methodu etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cikarmasidir

        overriding i nerede dikkate aliyoruz?
        bir obje olusturulken data turu ve const farkli ise

        eger bir obje olusturulurken data turu ve const farki ise
        objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz
        1-obje const oldugu class da olusur
        2-objenin ozelliklerini aramaya data turunun oldugu class dan baslariz bu class da
        aranan ozellik bulunamassa parent class lara bakilir orada da bulunmassa CTE verir

        eger aranan ozellik varibale ise buldugumuz ilk degeri yazdirir
        3-aranan ozellik method ise degeri yazdirmadan once override edilmis mi diye
        kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdirir

         */

        BMuhasebe yh1=new EYanHizmetliler();

        System.out.println(yh1.gunlukMesai); // muhasebe classinda alir 8
        System.out.println(yh1.saatUcreti); // muhasebe classinda alir 10
        yh1.maas(); // YH classinda alir
        yh1.ozelSigorta(); // Muhasebe classinda alir
        yh1.sigorta(); // Personel classinda alir
        System.out.println(yh1.isim); // personel classinda alir
        System.out.println(yh1.soyisim); // Per
        System.out.println(yh1.departman); // Per
        //System.out.println(yh1.issizlikSigortasi);
        //aramaya muhasebeden basladigimizdan
        //issizlikSigortasi bulamadik CTE



    }
}