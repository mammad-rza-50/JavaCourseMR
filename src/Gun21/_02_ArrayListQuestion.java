package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_ArrayListQuestion {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.

        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Sayi girin= ");
            array[i] = scan.nextInt();
        }
        System.out.println("Arrays.toString(aray) = " + Arrays.toString(array));

        ArrayList<Integer> tekler = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0)
                tekler.add( array[i] );
        }
        System.out.println("tekler = " + tekler);


//    //2.Yöntem
//        for (int i = 0; i < array.length; i++) {
//        System.out.print("Sayı=");
//        array[i]=scan.nextInt();
//
//        if (array[i]  %2 !=0)
//            tekler.add(  array[i]  );
//    }
}
}