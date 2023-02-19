package Gun41;

import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        boolean isAfter = today.isAfter(yesterday);// bugun dunenden sonrami
        System.out.println("isAfter = " + isAfter);

        boolean isBefore = today.isBefore(yesterday);// bugun dunenden qabaq mi
        System.out.println("isBefore = " + isBefore);

        boolean isEqual = today.isEqual(yesterday);// bugun dunene berabermi
        System.out.println("isEqual = " + isEqual);

        boolean isLeapYear = today.isLeapYear();// bugun artiq ilmi
        System.out.println("isLeapYear = " + isLeapYear);





    }
}
