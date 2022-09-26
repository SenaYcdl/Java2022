package day30_immutable_Date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 3 ay ve 100 saat sonra
        System.out.println(tarihSaat.minusDays(100).minusMinutes(100)); //100 gun ve 100 dk once
        System.out.println(tarihSaat.minusDays(3).plusHours(100)); // 3 gun once 100 saat sonra
        System.out.println(tarihSaat.toLocalDate()); // date formatina cevirir

    }
}
