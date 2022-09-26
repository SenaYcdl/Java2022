package day31_Timeformater_Varrags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih: " + tarihSaat);

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");
        System.out.println("dtf1 = " + dtf1.format(tarihSaat)); // dtf1 = 25/7/22 09:46 PM

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a");
        System.out.println("dtf2 = " + dtf2.format(tarihSaat));  // dtf2 = 25/Jul/2022 21:46 PM



    }
}
