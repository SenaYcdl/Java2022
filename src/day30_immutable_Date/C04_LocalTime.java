package day30_immutable_Date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1); // 19:12:30.483522300

        /*
        Bizim olusturdugumuz date ve time
        canli saat veya tarih degildir
        LocalTime.now(); kullandimiz satirda o anki tarih veya satiri alip bizim variable imiza
        store eder.
        time1 variable nin degeri sabittir
         */

        Thread.sleep(3000); // kodu bir sureligine bekletir ama yinede ayni dgeri verir
        System.out.println(time1); // 19:13:57.428945300

        time1=LocalTime.now();
        System.out.println(time1);

        System.out.println(time1.getSecond()); //20
        System.out.println(time1.plusSeconds(100)); // 100 saniye sonra
        System.out.println(time1.minusMinutes(200)); // 200 dk oncesi
        System.out.println(time1.withHour(3)); // saati 3 yapti


    }
}
