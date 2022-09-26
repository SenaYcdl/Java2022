package day33_Encapsulation;

public class Araba {

    String marka="Marka belirtilmedi"; // markanin access modifieri default acces modifier oldugundan package icerisinde kullanilabilir
    private String model="Model belirtilmedi";
    private String yakit="Elektrikli"; // tum arabalar elektrikli ise bu variable in degistirilmemesi lazim
    /*
    private yaptigimiz model ve yakit variablelarina erisimi yetkilendirelim
    model e deger atanabilsin ama gorulemesin(setter)
    yakit ise gorulebilsin ama yeni deger atanamasin isteniyor(getter)
     */


    public String getYakit() {
        return yakit;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
