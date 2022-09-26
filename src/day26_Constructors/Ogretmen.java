package day26_Constructors;

public class Ogretmen {

    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="DogumTarihi belirtilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yanbrans belirtilmedi";

    public Ogretmen() {  //hic parametre yok

    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim=" + isim +
                "\nsoyisim=" + soyisim +
                "\ndogumTarihi=" + dogumTarihi +
                "\nbrans=" + brans +
                "\nyanBrans=" + yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }
}
