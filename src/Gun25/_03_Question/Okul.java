package Gun25._03_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        ArrayList<Oyrenci> sinif = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Oyrenci oyr = new Oyrenci();

            System.out.print("Oyrenci adi= ");
            oyr.adi = scanStr.nextLine();
            System.out.print("Oyrenci soyadi= ");
            oyr.soyadi = scanStr.nextLine();
            System.out.print("Oyrenci sinfi= ");
            oyr.sinifi = scanInt.nextInt();
            System.out.print("Oyrenci adresi= ");
            oyr.adres = scanStr.nextLine();

            sinif.add(oyr);

        }
        for (Oyrenci oyr : sinif) {
            System.out.println("oyr.adi = " + oyr.adi);
            System.out.println("oyr.soyadi = " + oyr.soyadi);
            System.out.println("oyr.sinifi = " + oyr.sinifi);
            System.out.println("oyr.adres = " + oyr.adres);

        }
    }
}
