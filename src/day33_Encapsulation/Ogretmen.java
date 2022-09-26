package day33_Encapsulation;

public class Ogretmen {

    private String isim;
    private String soyisim;
    private String brans;

    /*
    bazen de yetkileri sinirlamak degilde yapilan isi daha iyi tanimlamak icin encapsulation kullanilir
    bunun iicn bu yaklasimi kullanana classlarda tum variable lar private yapilip
    hepsi icin getter ve setter olusturulur

     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
