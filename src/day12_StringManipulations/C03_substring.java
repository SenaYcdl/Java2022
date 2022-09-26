package day12_StringManipulations;
public class C03_substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo= "1234 5678 9678";
        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring(soyisim.length()-3));

        System.out.println(isim.substring(2,4));

        //isim ve soyismin ilk harfi buyuk geriye kalan *
        //kredi kartinin ilk 4 rakami gorulsun geriye kalan *

        String isimIlkharf=isim.substring(0,1).toUpperCase();
        String isimgeriyekalan=isim.substring(1).replaceAll("\\w", "*");

        String soyIsimIlkharf=soyisim.substring(0,1).toUpperCase();
        String soyIsimgeriyekalan=soyisim.substring(1).replaceAll("\\w", "*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyekalanlar=" **** **** ****";

        System.out.println(isimIlkharf+isimgeriyekalan + " "+
                soyIsimIlkharf+soyIsimgeriyekalan+ "\n "+
                kkIlk4+kkGeriyekalanlar );




    }
}
