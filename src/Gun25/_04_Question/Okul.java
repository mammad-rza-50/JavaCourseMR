package Gun25._04_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        //todo:
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        ArrayList<Oyrenci> sinif = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Oyrenci oyr = new Oyrenci();

            System.out.print("Okul N= ");
            oyr.okulNo = scanInt.nextInt();
            System.out.print("Tam adi= ");
            oyr.FullName = scanStr.nextLine();
            System.out.print("Notu= ");
            oyr.notu = scanInt.nextInt();

            sinif.add(oyr);

        }

        bilgileriYazdir(sinif);
        notOrta(sinif);

    }

    public static void notOrta(ArrayList<Oyrenci> sinif) {

        int toplam = 0;

        for (Oyrenci oyr : sinif) {
            toplam = toplam + oyr.notu;

        }

        System.out.println("toplam/ sinif.size() = " + toplam / sinif.size());

    }

    public static void bilgileriYazdir(ArrayList<Oyrenci> sinif) {

        for (Oyrenci oyr : sinif) {
            System.out.println("oyr.okulNo = " + oyr.okulNo);
            System.out.println("oyr.FullName = " + oyr.FullName);
            System.out.println("oyr.notu = " + oyr.notu);

        }
    }
}
