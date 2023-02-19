package Gun10;

import java.util.Scanner;

public class _04_mantiksalIfadeler {
    public static void main(String[] args) {
         // Mantiksal ifadeler
        // && ve isareti (Shift=-+6)
        // || veya isareti (altGr<)

        // Girilen sayi positiv ve tek ise ekrana uygun sayi girildi
        // deyise uygun sayi girilmedi

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int sayi = scan.nextInt();

        // hem tek hem positiv -->  sayi%2==1  && sayi>0

        if (sayi%2==1 && sayi>0) {
            System.out.println("sayi uygun gilidi");
        }
        else {
            System.out.println("sayi uygun gilimedi");
        }

        }



    }

