package Gun21;

import java.util.ArrayList;

public class _09_JavaArrayHomeAssignment5 {
    public static void main(String[] args) {

//     5.    ismi getCount() olan bir method oluşturun.
//            Parametre olarak bir String ArayList  ve  bir tane String
//            Return tipi int olmalı.
//             ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//             Örneğin;
//                      ArrayList = Orange , Kiwi , Peach , Banana , Orange
//                    String Orange:
//                     Count = 2 olmalı. (Orange 2 kez yazılmış)

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Peach");
        fruits.add("Banana");
        fruits.add("Orange");
        String fruit = "Orange";
        getCount(fruits, fruit);


    }

    public static int getCount(ArrayList<String> fruits, String fruit) {

        int count = 0;

        for (int i = 0; i < fruits.size(); i++) {

            if (fruits.get(i).equals(fruit))
                count++;

        }
        System.out.println("Count= " + count + "\n"+ fruit + " " + count + " kez yazilmis");
        return count;
    }

}

