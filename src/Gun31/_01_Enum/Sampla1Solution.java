package Gun31._01_Enum;

public class Sampla1Solution {

    enum Months {
        zero, January, February, March, April, May, June,
        July, August, September, October, November, December
    }

    public static void main(String[] args) {

        Months month = Months.July;

        switch (month) {

            case February:
                System.out.println(28);
                break;
            case January:
            case March:
            case May:
            case July:
            case August:
            case October:
            case December:
                System.out.println(31);
                break;
            case April:
            case June:
            case September:
            case November:
                System.out.println(30);
                break;
        }

        if (month == Months.July)
            System.out.println("I was born");

        System.out.println("month = " + month);
        System.out.println("month.name() = " + month.name());
        System.out.println("month.ordinal() = " + month.ordinal());

        for (Months mnth : Months.values())
            System.out.println("mnth.ordinal() = " + mnth.ordinal());

    }

}

