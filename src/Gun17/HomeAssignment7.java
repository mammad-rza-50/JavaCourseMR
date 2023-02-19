package Gun17;

public class HomeAssignment7 {
    public static void main(String[] args) {

//        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//
//        Array'in ortalamasını alınız.

        int[] numbers = {12, 14, 21, 23, 10, 4};

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {

            total += numbers[i];

        }
        int middle = total / numbers.length;
        System.out.println("Numbers middle = " + middle);


    }
}
