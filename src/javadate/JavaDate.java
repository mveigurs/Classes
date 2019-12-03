package javadate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime locDateTime = LocalDateTime.now();
        System.out.println(localDate.plusMonths(2));


        System.out.println("Date now is: " + localDate + " Time now is " + localTime);

        DateTimeFormatter datums = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String locDateFormat = localDate.format(datums);

        System.out.println("Formatted date: " + locDateFormat);
    }
}
