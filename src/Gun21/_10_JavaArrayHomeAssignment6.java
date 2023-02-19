package Gun21;

import java.util.ArrayList;

public class _10_JavaArrayHomeAssignment6 {
    public static void main(String[] args) {


//     6.   getSum() isminde bir method oluşturun.
//          Parametresi ArrayList olmalı
//          Return tipi int olmalı.
//          ArrayList teki tüm sayıları birbiri ile toplayın.
//           return olarak toplam sonucu döndürün.
//                Örneğin;
//                      Arraylist = 1,2,3,4,5
//                                            return 15 olmalı

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2); numbers.add(3); numbers.add(4); numbers.add(5);
        numbers.add(6); numbers.add(7); numbers.add(8); numbers.add(9); numbers.add(10);

        getSum(numbers);

    }

    public static int getSum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {

            total += numbers.get(i);

        }
        System.out.println("Totai= " + total);
        return total;
    }
}
