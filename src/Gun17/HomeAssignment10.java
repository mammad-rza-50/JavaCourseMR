package Gun17;

import java.util.Arrays;

public class HomeAssignment10 {
    public static void main(String[] args) {

//        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//
//        En küçük (minimum) sayıyı yazdırınız.

        int[] numbers = {14,19,5,21};
        int minNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (minNumber>numbers[i])

                minNumber=numbers[i];
        }
        System.out.println("MinNumber = " + minNumber);

        // 2.Yöntem
        Arrays.sort(numbers);
        System.out.println("2.yöntem min-> " + numbers[0]);

    }
}


