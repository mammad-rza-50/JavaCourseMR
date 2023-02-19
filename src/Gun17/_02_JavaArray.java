package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5
        // for ile yazin proqrami
        Scanner scan = new Scanner(System.in);
        int sayac=1;
        System.out.print("Bir cumle girin:");
        String cumle = scan.nextLine();
        String cumleTrim = cumle.trim();

        for (int i = 0; i <cumleTrim.length(); i++) {

            if (cumleTrim.charAt(i) == ' ')
                sayac++;

        }
        System.out.println("Cumlede " + sayac + " kelime var");


    }
}
