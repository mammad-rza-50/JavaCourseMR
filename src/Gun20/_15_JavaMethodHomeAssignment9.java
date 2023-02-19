package Gun20;

import java.util.Arrays;

public class _15_JavaMethodHomeAssignment9 {
    public static void main(String[] args) {

//        **isUnique** adında bir method oluşturun.
//        Parametre olarak int array alır.
//                ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
//        örneğin, list isminde bir array'imiz varsa,
//        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//        Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
//        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.


        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};

        System.out.println(isUnique(list));
        System.out.println(isUnique(list2));
    }

    public static boolean isUnique(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j])
                    return false;
            }
        }
        return true;
    }
}
