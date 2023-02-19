package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) {

        //LocalDateTime hem tarix ve saat melumatlari tutur

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        System.out.println("localDateTime.getYear() = " + localDateTime.getYear());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonth());
        System.out.println("localDateTime.getMonthValue() = " + localDateTime.getMonthValue());
        System.out.println("localDateTime.getDayOfYear() = " + localDateTime.getDayOfYear());
        System.out.println("localDateTime.getDayOfMonth() = " + localDateTime.getDayOfMonth());
        System.out.println("localDateTime.getDayOfWeek() = " + localDateTime.getDayOfWeek());
        System.out.println("localDateTime.getDayOfWeek().getValue() = " + localDateTime.getDayOfWeek().getValue());
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getSecond());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getNano());

        System.out.println("ISO_DATE_TIME) = " + localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("FULL = " + localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("MEDIUM = " + localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("SHORT = " + localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("localDateTime = " + localDateTime.format(dateTimeFormatter));
    }
}
