package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _05_JavaLocalTime {
    public static void main(String[] args) {

        // LocalTime : Tarix melumalri yoxdur yalniz saat,deq,san,millisaniye

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);
        System.out.println("time.getHour() = " + time.getHour());
        System.out.println("time.getMinute() = " + time.getMinute());
        System.out.println("time.getSecond() = " + time.getSecond());
        System.out.println("time.getNano() = " + time.getNano());

        /*************************************************/

        // Ozume gore format
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("time = " + time.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("kk:mm a");
        System.out.println("time = " + time.format(formatter2));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("K:mm");
        System.out.println("time = " + time.format(formatter3));

        /*********************************************/

        LocalTime time1 = LocalTime.of(7, 12, 14);
        System.out.println("time1 = " + time1);

    }
}
