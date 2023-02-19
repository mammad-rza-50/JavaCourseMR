package Gun31._03_Enum;

import java.time.Month;
import java.time.Year;

public class MonthsMain {
    public static void main(String[] args) {


        // ayın kaç gün sürdüğünü metod gerekiyor
        // ayın türkçe yazılışı metod gerekiyor
        // ayın gerçek sıra nosu metod gerekiyor

        // Java diyorki bu şekilde tek bir kelime veya
        // sayı olan degerleri olacaksa, sana bir kolaylık
        
        Months months = Months.July;

        System.out.println("months = " + months);
        System.out.println("months.monthNo = " + months.monthNo);
        System.out.println("months.monthName = " + months.monthName);
        System.out.println("months.daySum = " + months.daySum);
        
        for (Months mnth : Months.values())
            System.out.println("mnth.monthName = " + mnth.monthName);
    }
}
