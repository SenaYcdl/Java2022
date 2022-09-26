package day25_Constructors;

public class C01 {

    /*

    1- Obje olusturmak icin constructor kullanmak zorundayiz
    2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur
    3- Her class'da gormesek bile Java'nin koydugu default constructor vardir


    Java OOP konsept kullnadigi icin olusturulan her bir classin
    ihyitac oldugunda obje uretebilmesine uygun dizayn etmistir
    Ama her class dan obje uretilmeyebilir bunun icin java ihtiyac halinde kullanilmasi icin her
    class da default bir constructor koymustur

    Bu default constructor class dan obje olusturuldugunda otomatik olarak calisir

    ornegin bu class da constructor gorulmemesine ragmen C02 class inda, icinde
    oldugumuz C01 class indan bir obje uretebildik
     */

    int sayi;

    public void deneme() {
        System.out.println("C01 den deneme methodu calistir");
    }

    }

