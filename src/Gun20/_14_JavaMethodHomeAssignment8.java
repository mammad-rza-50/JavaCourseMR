package Gun20;

import java.util.Arrays;

public class _14_JavaMethodHomeAssignment8 {
    public static void main(String[] args) {

//`         append adında bir method oluşturun.`
//`         Parametre olarak iki int array  oluşturun.`
//          ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//                Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//                Bunu döndürmelidir:
//        {2, 4, 6, 1, 2, 3, 4, 5}.

        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 0};
        int[] array3 = append(array1, array2);

    }

    public static int[] append(int[] array1, int[] array2) {

        int[] array3 = new int[array1.length + array2.length];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            count++;

        }
        for (int i = 0; i < array2.length; i++) {
            array3[count++] = array2[i];

        }
        for (int i = 0; i < array3.length; i++) {

        }
        System.out.print(Arrays.toString(array3));
        return array3;
    }
}
