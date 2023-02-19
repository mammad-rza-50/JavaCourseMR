package Gun39._05_OOP_Question;

import MyFunction.MyFunction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class TechnoCafe {

    public static void main(String[] args) {


        Scanner scanInt = new Scanner(System.in);
        List<IFood> orders = new ArrayList<>();

        int chose = 0;
        int order = 0;

        do {

            System.out.print("********>Menu<********\n1-Adana Kebab (5 AZN)\n2-Lahmacun" +
                    "(3 AZN)\n3-Borsh (3 AZN)\n4-Pilov (4 AZN)\n0-Tamam\n-->Seciminiz:");
            chose = scanInt.nextInt();

            switch (chose) {

                case 1:
                    IFood adanaKebab = new AdanaKebab(); //AdanaAkebab da ola biler
                    orders.add(adanaKebab);
                    order++;
                    break;
                case 2:
                    IFood lahmacun = new Lahmacun();  // Lahmacun da ola biler
                    orders.add(lahmacun);
                    order++;
                    break;
                case 3:
                    IFood borsh = new Borsh(); // Borsh da ola biler
                    orders.add(borsh);
                    order++;
                    break;
                case 4:
                    IFood pilov = new Pilov(); //Pilov da ola biler
                    orders.add(pilov);
                    order++;
                    break;
//                default:
//                    System.out.println("Secim hatali");
//                    break;
            }

        } while (chose < 5);
        System.out.println("*******Alinan sifarisler*******");

        for (IFood chFood : orders) {

            System.out.println(chFood.getClass().getSimpleName());

        }
        System.out.println("============================================");

        int totalOrdrs = 0;
        int totalFee = 0;
        for (IFood feeOrdr : orders) {
            TechnoKitchen.prepare(feeOrdr);
            totalFee += feeOrdr.fee();
            totalOrdrs++;
        }
        System.out.println("Toplam= " + totalOrdrs + " sifarisiniz var");
        System.out.println("Toplam ucret= " + totalFee + " AZN");
    }

}
