package Gun23;

import java.util.Arrays;
import java.util.HashSet;

public class HomeAssignment_6 {
    public static void main(String[] args) {

//    6- Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
//        random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
//        sayılarla doldurunuz. Set i main de yazdırınız.

        HashSet<Integer> numbers = new HashSet<>();

        numbers(numbers);


    }

    public static void numbers(HashSet<Integer> numbers) {


        Integer[] arrays = new Integer[10];

        for (int i = 0; i < 10; i++) {

            arrays[i] = (int) (Math.random() * 21);

        }

        System.out.println(Arrays.toString(arrays));
        numbers.addAll(Arrays.asList(arrays));

        System.out.println(numbers);

    }

}
