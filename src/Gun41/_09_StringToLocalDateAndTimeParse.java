package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {

        // Kullanicidan alinan ve string veziyyetindeki time ve ya tarix
        // melumatlarinin time ve ya tarix melumatina cevrilmesi

        long startTime = System.currentTimeMillis(); // kodun performansi

        Scanner scan = new Scanner(System.in);
        System.out.println("Tarix melumatini girin(29.01.2023)= ");
        String strDate = scan.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = LocalDate.parse(strDate,dateTimeFormatter);

        System.out.println("date = " + date);

        long finishTime = System.currentTimeMillis();
        System.out.println("Kecen vaxt = " + (finishTime-startTime) + " millisaniye");

    }
}
