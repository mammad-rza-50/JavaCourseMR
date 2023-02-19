package Gun41;

import MyFunction.MyFunction;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class _01_Question {

    // Canli saat duzeldin

    public static void main(String[] args) {

        while (true) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            LocalTime time = LocalTime.now();
            System.out.print("\r"+time.format(formatter));
            MyFunction.wait(1);
        }

    }
}