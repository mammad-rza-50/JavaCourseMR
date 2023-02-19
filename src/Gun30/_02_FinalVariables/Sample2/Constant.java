package Gun30._02_FinalVariables.Sample2;

public class Constant {

    final static int days_hour = 24;
    final static int hours_minute = 60;
    final static int minutes_second = 60;

    public static int calculate(int days, int hours, int minutes) {

        int totalSecond = days *
                Constant.days_hour *
                Constant.hours_minute *
                Constant.minutes_second +
                hours *
                        Constant.hours_minute *
                        Constant.minutes_second +
                minutes *
                        Constant.minutes_second;

        return totalSecond;
    }
}
