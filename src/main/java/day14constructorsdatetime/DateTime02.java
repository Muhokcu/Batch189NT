package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//21:48:15.968177800


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = dtf1.format(myCurrentTime);
        System.out.println("formattedTime = " + formattedTime);

        //Date formati
        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");//Ağustos/28/2023
        String formattedCurrentDate = dtf2.format(myCurrentDate);
        System.out.println("formattedCurrentDate = " + formattedCurrentDate);


        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");//28-Ağu-2023
        String formattedCurrentDate1 = dtf3.format(myCurrentDate);
        System.out.println("formattedCurrentDate1 = " + formattedCurrentDate1);


// Baska bir zaman dilimini nasil aliriz ===> Ornek Tokyo
        LocalDate tokyoNow = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("tokyoNow = " + tokyoNow);


        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInTokyo = " + timeInTokyo);



        LocalDateTime ltd = LocalDateTime.now();//2023-08-28T22:17:49.513779300
        System.out.println(ltd);


        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MM-yyyy/hh:mm");//28-08-2023/10:22
        String formattedLtd = dtf4.format(ltd);
        System.out.println(formattedLtd);

    }
}
