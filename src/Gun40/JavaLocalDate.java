package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate day/month/year

        LocalDate date = LocalDate.now();

        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());
        System.out.println("date.getDayOfWeek().getValue() = " + date.getDayOfWeek().getValue());

        // ozundeki hazir formatlar

        System.out.println("ISO_DATE= " + date.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT  = "+date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM  = "+date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG  = "+date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL  = "+date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("\n*************************************************************");

        //Localde aldigim tarixi istediyim formatlara gore, diline gore nece gosterek?
        // meselen Germany

        System.out.println("full Germany tarixi = \n"+
                date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));

        Locale[] useLocal = Locale.getAvailableLocales();
        
        for (Locale local : useLocal) {

            if (local.getDisplayCountry().contains("Az")) ;
            {
                System.out.println("local.getDisplayCountry() = " + local.getDisplayCountry());
                System.out.println("local.getDisplayLanguage() = " + local.getDisplayLanguage());
                System.out.println("local.getCountry() = " + local.getCountry());
                System.out.println("local.getLanguage() = " + local.getLanguage());
            }

            Locale localeAz = new Locale("az","AZ");
            System.out.println("Azerbaijan= "+date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(localeAz)));
        }

        // ozel date formatlari

        DateTimeFormatter specialFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("dd/MM/yyyy = "+date.format(specialFormat1));
        DateTimeFormatter specialFormat2 = DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("d/M/yy = "+date.format(specialFormat2));
        DateTimeFormatter specialFormat3 = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        System.out.println("EEEE dd/MM/yyyy = "+date.format(specialFormat3));
        DateTimeFormatter specialFormat4 = DateTimeFormatter.ofPattern("EE d/M/yy");
        System.out.println("EE d/M/yy = "+date.format(specialFormat4));
        DateTimeFormatter specialFormat5 = DateTimeFormatter.ofPattern("MMMM d/M/yy");
        System.out.println("MMMM d/M/yy = "+date.format(specialFormat5));


        LocalDate date1 = LocalDate.of(2007,06,01);
        LocalDate date2 = LocalDate.of(2008, Month.JULY,11);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

    }
}
