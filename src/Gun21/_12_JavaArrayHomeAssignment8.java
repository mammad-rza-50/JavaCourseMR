package Gun21;

import java.util.ArrayList;

public class _12_JavaArrayHomeAssignment8 {
    public static void main(String[] args) {

//    8     İsmi changelnArraylist() olan bir method oluşturun.
//           Parametre olarak String ArrayList, String s1, String s2
//           Arraylist'te s1'i s2 olarak değiştirin
//           Return String arrayList
//                Örneğin;
//                       Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//                s1 = blue
//                s2 = yellow
//                Tüm blue 'ları yellow'a dönüştürün.
//                cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("yellow");
        fruits.add("red");
        fruits.add("blue");
        fruits.add("red");
        fruits.add("blue");

        changelnArray(fruits, "blue", "yellow");

    }

    public static ArrayList<String> changelnArray(ArrayList<String> fruits, String s1, String s2) {

        for (int i = 0; i < fruits.size(); i++) {

            if (fruits.get(i).equals(s1))  fruits.set(i, s2);

        }
        System.out.println(fruits);

        return fruits;
    }
}






