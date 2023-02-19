package Gun31._03_Enum;

public enum Months {

    January(1, 31, "Yanvar"),
    February(2, 28, "Fevral"),
    March(3, 31, "Mart"),
    April(4, 30, "Aprel"),
    May(5, 31, "May"),
    June(6, 30, "Iyun"),
    July(7, 31, "Iyul"),
    August(8, 31, "Avqust"),
    September(9, 30, "Sentyabr"),
    October(10, 31, "Oktyabr"),
    November(11, 30, "Noyabr"),
    December(12, 31, "Dekabr");

    final int monthNo;
    final int daySum;
    final String monthName;

    Months(int monthNo, int daySum, String monthName) {
        this.monthNo = monthNo;
        this.daySum = daySum;
        this.monthName = monthName;
    }
}
