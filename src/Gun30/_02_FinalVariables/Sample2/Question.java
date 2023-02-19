package Gun30._02_FinalVariables.Sample2;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {


        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int day = 0;
        int hour = 0;
        int minute = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Gun girin= ");
        day = scan.nextInt();
        System.out.println("Saat girin= ");
        hour = scan.nextInt();
        System.out.println("Dakika girin= ");
        minute = scan.nextInt();

        // 1 way

        int totalSecond = day *
                Constant.days_hour *
                Constant.hours_minute *
                Constant.minutes_second +
                hour *
                        Constant.hours_minute *
                        Constant.minutes_second +
                minute *
                        Constant.minutes_second;
        System.out.println("totalSecond = " + totalSecond);

        // 2 way

        System.out.println("totalSecond = " + Constant.calculate(day, hour, minute));

    }
}