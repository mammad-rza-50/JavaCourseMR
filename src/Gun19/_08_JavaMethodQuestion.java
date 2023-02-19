package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _08_JavaMethodQuestion {
    public static void main(String[] args) {

        // 20 elemanlı bir dizinin elemanlarını 100 kadar random sayılarla
        // bir fonksiyonda doldurunuz ve aynı fonksiyonda yazdırınız.

        int[] array = new int[20];
        randomScan(array);

    }

    public static void randomScan(int[] numbers) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = (int) (Math.random() * 100);

        }
        System.out.println("Numbers" + Arrays.toString(numbers));
    }
}
