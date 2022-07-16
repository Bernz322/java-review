package Basics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateMethods {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        /**
         * yyyy-MM-dd | "1988-09-29"
         * dd/MM/yyyy| "29/09/1988"
         * dd-MMM-yyyy | "29-Sep-1988"
         * E, MMM dd yyyy | "Thu, Sep 29 1988"
         */

        String formattedDT = dateTime.format(dateTimeFormatter);

        System.out.println("Current date: " + date);
        System.out.println("Current time: " + time);
        System.out.println("Current date & time (before format): " + dateTime);
        System.out.println("Current date & time (after format): " + formattedDT);
    }
}
