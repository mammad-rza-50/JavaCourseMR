package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _06_HomeWorkQuestion {
    public static void main(String[] args) {

        // 10 elemanli bir diziyi random(10 dahil)olaraq doldurduqdan sonra
        //kullanicinin gireceyi bir raqami arattiriniz
        // bu raqam var ise indexini yazdirin
        //  ikinci ideal yontemmm

        Scanner scan = new Scanner(System.in);

        int[] elemanlar = new int[10];

        for (int i = 0; i < elemanlar.length; i++) {

            elemanlar[i] = (int) (Math.random() * 11);

        }

        System.out.println(Arrays.toString(elemanlar));

        System.out.print("0-10 arasi bir sayi girin= ");

        int sayi = scan.nextInt();

        boolean isHave = false;

        for (int i = 0; i < elemanlar.length; i++) {

            if (sayi == elemanlar[i])
            {

                isHave=true;

                System.out.println("Tapildi= " + i);
            }
        }

        if (!isHave)
        {
            System.out.println("Tapilmadi");
        }

    }
}
