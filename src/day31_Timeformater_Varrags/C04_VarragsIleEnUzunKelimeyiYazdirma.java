package day31_Timeformater_Varrags;

public class C04_VarragsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        
        enUzunKelimeyiYazdir("Ali","Ayse", "Ismail","Ahmet", "Babayigit");
    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

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
