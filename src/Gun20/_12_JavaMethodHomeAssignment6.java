package Gun20;

import java.util.Arrays;

public class _12_JavaMethodHomeAssignment6 {
    public static void main(String[] args) {

        //  6- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        int[] arrays = {14, 20, 35, 42, 12, 80, 85};
        reverseArray(arrays);
    }

    public static void reverseArray(int[] arrays1) {

        for (int i = arrays1.length - 1; i >= 0; i--) {
            System.out.print(arrays1[i] + "\t");
        }
    }
}
