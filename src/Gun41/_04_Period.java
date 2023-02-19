package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _04_Period {
    public static void main(String[] args) {

        // Period 2 tarix arasindaki ferqi gosterir
        // LocalDate ler ucucn istifade edilir

        LocalDate bornDate = LocalDate.of(1980,8,16);
        LocalDate today = LocalDate.now();
        Period difference = Period.between(bornDate,today);
        System.out.println("difference = " + difference);

        System.out.println("difference.getYears() = " + difference.getYears());
        System.out.println("difference.getMonths() = " + difference.getMonths());
        System.out.println("difference.getDays() = " + difference.getDays());

        /***********************************************************************/

        Period period7Day =Period.ofDays(7);
        Period period7Month =Period.ofMonths(7);
        System.out.println("period7Day = " + period7Day);
        System.out.println("period7Month = " + period7Month);

        LocalDate after7Day = today.plus(period7Day);
        System.out.println("after7Day = " + after7Day);
        
        /*************************************************************/
        
        // kursun bitme tarixi
        
        LocalDate startCourse = LocalDate.of(2022,10,31);
        Period sixMonth = Period.ofMonths(6);
        LocalDate finishCourse = startCourse.plus(sixMonth);
        System.out.println("finishCourse = " + finishCourse);
        System.out.println("finishCourse.getDayOfWeek() = " + finishCourse.getDayOfWeek());

        // kursun bugunku gunden bitme vaxti
        Period remainTime = Period.between(today,finishCourse);
        System.out.println("remainTime = " + remainTime);

        // kursun bugune kadar baslama vaxti
        Period startOfCourseDay = Period.between(today,startCourse);
        System.out.println("startOfCourseDay = " + startOfCourseDay);


    }
}
