package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonedDateTime {
    // Basqa zaman bolgelerindeki (time Zone) melumatlari alma
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        // bu an menim oldugum default zamani verdi

        Set<String> timeZona = ZoneId.getAvailableZoneIds();

        for (String zona : timeZona){

            if (zona.toLowerCase().contains("baku"))

               System.out.println("zona = " + zona);
        }
        ZoneId zoneIdBaku = ZoneId.of("Asia/Baku");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zoneIdBaku);
        System.out.println("zonedDateTime1 = " + zonedDateTime1);



    }
}
