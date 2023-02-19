package Gun17;

import java.util.Arrays;

public class HomeAssignment9 {
    public static void main(String[] args) {


//        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//
//        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] numbers = {15, 25, 22, 18, 30};

        Arrays.sort(numbers);

        for (int i = numbers.length - 2; i < numbers.length; i++) {

            System.out.println("Boyuk eleman = " + numbers[i]);

        }

        // 2 yontem

        int[] arr = {15, 25, 22, 18, 30};
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if
            (arr[i] > max2) {
                max2 = arr[i];

            }
        }
        System.out.println("Birinci büyük eleman: " + max1);
        System.out.println("Ikinci büyük eleman: " + max2);

        // 3 yontem

        Arrays.sort(arr);
        System.out.println("En boyuk birinci eleman= " + arr[arr.length - 1]);
        System.out.println("En boyuk ikinci eleman= " + arr[arr.length - 2]);

    }
}

