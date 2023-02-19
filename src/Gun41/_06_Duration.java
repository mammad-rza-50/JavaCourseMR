package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        
        //Duration : hem LocalTime hemde LocalDate ucun istifade edilir
        // LocalDateTime ferqini verir
        
        // LocalTime 
        LocalTime startLesson = LocalTime.of(20,0,0);
        LocalTime finishLesson = LocalTime.of(23,0,0);

        Duration lessonTimeOfDay= Duration.between(startLesson,finishLesson);
        System.out.println("lessonTimeOfDay = " + lessonTimeOfDay);

        System.out.println("lessonTimeOfDay.toHours() = " + lessonTimeOfDay.toHours());
        System.out.println("lessonTimeOfDay.toMinutes() = " + lessonTimeOfDay.toMinutes());
        System.out.println("lessonTimeOfDay.toMillis() = " + lessonTimeOfDay.toMillis());

        // LocalDateTime *** 2 tarix-saat arasindaki ferq***
        LocalDateTime from = LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to = LocalDateTime.now();

        Duration differenceTime = Duration.between(from,to);
        System.out.println("differenceTime = " + differenceTime);
        System.out.println("differenceTime.toDays() = " + differenceTime.toDays());
        System.out.println("differenceTime.toHours() = " + differenceTime.toHours());
        System.out.println("differenceTime.toMinutes() = " + differenceTime.toMinutes());


    }
}
