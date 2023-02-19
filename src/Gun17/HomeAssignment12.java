package Gun17;

import java.util.Arrays;

public class HomeAssignment12 {
    public static void main(String[] args) {

//        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//
//        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//
//        Eğer aitse "true" çevirin.
//
//                Loops (döngüler) kullanın.


        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple"};

        int isHave = Arrays.binarySearch(fruits, "Apple");

        if (isHave >= 0)
            System.out.println("True");
        else
            System.out.println("False");

        // 2 yontem

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("Apple")) {
                System.out.println(true);
            }
        }
    }
}


