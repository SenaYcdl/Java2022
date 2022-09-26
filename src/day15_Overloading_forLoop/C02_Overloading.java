package day15_Overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        /*
        java da olusturulan methodlarin isminin yaptigi islev ile uyumlu olmasini isteriz
        mesela bir String in bir bolumunu alamk icin 2 adet substring() methodu veya veilen
        string deki bazi parcalari yenileri ile degistirmek icin 2 adet replace() methodu var

        java ayni isimde birden fazla method varsa hangisinin kullanilacagina parametre sayisi ve
        parametlerin data turune gore karar verir
         */

        String str="Bu java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);

        str.replace('c', 'v');
        str.replace("J", "H");

        /*
        Ayni isimde ama farkli method lari olusturmak icin
        degistirebilecegimiz seyler
        1-parametre sayisi
        2-ayni sayida parametreye sahip olsa bile,parametrelerin
        data turleri
        3-ayni sayida ayni data turunde parametreleri olan methodlarda
        parametrelerin siralanisi

         */


    }
}
