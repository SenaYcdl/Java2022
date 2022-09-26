package day36_InheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe {

    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+ (30*saatUcreti*gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mm1=new CMemur();
        System.out.println(mm1.gunlukMesai);
        System.out.println(mm1.saatUcreti);
        mm1.maas();
        mm1.ozelSigorta();
        mm1.sigorta();
        System.out.println(mm1.isim);
        System.out.println(mm1.soyisim);
        System.out.println(mm1.departman);

        BMuhasebe mhsb1=new BMuhasebe();
        /*
        her ne kadar memur class inin icinde olsamda olusturdugum obje Muhasebe classinda
        cunku data turu ve constructor BMuhasebe

        String str="Murat";
        ArrayList<Integer> list=new ArrayList<Integer>();
        Integer sayi=20;
        BMuhasebe class ida obje olusturulabilen bir class dir yani data turudur
         */


        System.out.println(mhsb1.gunlukMesai);
        System.out.println(mhsb1.saatUcreti);
        mhsb1.maas();
        mhsb1.ozelSigorta();
        mhsb1.sigorta();
        System.out.println(mhsb1.isim);
        System.out.println(mhsb1.soyisim);
        System.out.println(mhsb1.departman);
    }

}
