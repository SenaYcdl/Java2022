package day30_immutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {

        //iki tarih arasindaki sureyi bulma

        LocalDate tarih1=LocalDate.of(1998,12,2);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(tarih1,bugun);
        System.out.println(period); // P-23Y-7M-21D // 23 yas 7 ay 21 gun

        System.out.println(period.getYears()); // 23
    }
}
