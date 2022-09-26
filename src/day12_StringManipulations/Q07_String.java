package day12_StringManipulations;

public class Q07_String {
    public static void main(String[] args) {

        // soru 7)kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        // isim-soyisim= S**** Y******
        //kredino= **** **** **** 1234

        String isim="Sena";
        String soyisim="Yucedal";
        String kredino= "1234 5678 4567 1234";

        String ilkHarf=isim.substring(0,1).toUpperCase();
        String kalan=isim.substring(1).replaceAll("\\w", "*");

        String soyisimIlkharf=soyisim.substring(0,1).toUpperCase();
        String geriyekalan=soyisim.substring(1).replaceAll("\\w", "*");

        String kredison=kredino.substring(0,14).replaceAll("\\w", "*");
        String kredikalan=kredino.substring(14,19);

        System.out.println(ilkHarf+ kalan +" "+
                soyisimIlkharf + geriyekalan +"\n"+
                kredison + kredikalan);







    }
}
