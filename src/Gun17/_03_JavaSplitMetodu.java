package Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {

        // Split: bir Stringi ayirmaq demek

        // kullanicidan alacagimiz cumleyi kelimelere
        // gore alt alta yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle girin= ");
        String cumle = scan.nextLine();

        String[] kelimeler = cumle.trim().split(" ");

        for (int i = 0; i < kelimeler.length; i++) {

            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}
