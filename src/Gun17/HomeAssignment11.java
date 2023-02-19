package Gun17;

import java.util.Arrays;

public class HomeAssignment11 {
    public static void main(String[] args) {

//        int Array oluşturun ve elemanları : 12,2,5,15,8
//
//        En büyük değeri yazdırınız.

        int[] numbers = {12,2,5,15,8};
        int maxNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (maxNumber<numbers[i]) {
                maxNumber=numbers[i];
            }
        }
        System.out.println("MaxNumber = " + maxNumber);

        // 2. Yöntem
        Arrays.sort(numbers);
        System.out.println("ikinci yöntemle max-> " + numbers[numbers.length-1]);

    }
}

