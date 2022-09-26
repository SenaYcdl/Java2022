package day34_Inheritance;

public class Personel {

    /*
    eger parent class olacak sekilde tasarladiginiz vor class varsa veya ilerde
    bu classi parent yapmak isteyen olabilir diyorsaniz ozamn variable
    ve methodlarin access modifier ini protected yapailir
     */

    protected int persNo;
    protected String isim="Isim belirtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas() {
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai() {
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti() {
        System.out.println("Personel fazla mesai ucretini statusune gore alir");
    }


}
