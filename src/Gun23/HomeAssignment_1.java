package Gun23;

import java.util.HashSet;

public class HomeAssignment_1 {
    public static void main(String[] args) {

//   1.    Create a method totalCount()
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//                           _**Örnek:**_
//                                      hashset ; 4,2,3,1,7
//                             cevap: 5

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(14);
        numbers.add(27);
        numbers.add(7);
        numbers.add(42);
        numbers.add(12);
        numbers.add(25);
        numbers.add(20);

        totalCount(numbers);

    }

    public static void totalCount(HashSet<Integer> numbers) {

        System.out.println(numbers.size());

    }

}
