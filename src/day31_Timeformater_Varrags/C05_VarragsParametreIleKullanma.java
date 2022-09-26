package day31_Timeformater_Varrags;

public class C05_VarragsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5, "Ali","Ayse", "Ismail","Ahmet", "Babayigit","Akin");

        /*
        Varrags teorik olarak sonsuz sayida element alabilir
        bir method da parametre olarak varrgas varsa
        varragsin sinirlarini bilebilmesi icin parametrelerin sonuncusu olmalidir
        oncesinde parametreler olabilir ama varragsdan sonra parametre olmaz
        bir method da iki tane varrags OLAMAZ
         */
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime=kelime[0];

        for (String each : kelime
        ){
            if (each.length()>enUzunKelime.length()) {
                enUzunKelime=each;
            }
        }

        System.out.println("enUzunKelime = " + enUzunKelime);

    }
    }

