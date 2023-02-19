package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Proqram islemeye basladi");

        try { // cehd ele, xetanin basladigi yerin ustune gedir

            LocalDate date = LocalDate.of(2023, Month.FEBRUARY, 30);
        }// xeta oldugu zaman proqrami qirmaq
        catch (Exception error) {
            //error adli deyiskende olan xetalarin melumatini alir
            // xeta oldugunda istelinenler buraya yazilir
            System.out.println("Xeta oldu tekrar cehd edin");
            System.out.println("Butun xetalarin mesaji= " + error);
            System.out.println("Xetanin aciklamasi= " + error.getMessage());
            // xeta mesajini ozune email ata bilersen
            // log tutma: proqram nece isleyir, xeta loglarini harddiske yaza bilirsen
        }
        System.out.println("Proqram bitti");


    }
}
