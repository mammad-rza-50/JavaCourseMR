package Gun21;

import java.util.ArrayList;

public class _11_JavaArrayHomeAssignment7 {
    public static void main(String[] args) {


//
//     7.    getLength() isminde bir method oluşturun.
//           Parametre olarak String ArrayList
//           Return tipi Integer ArrayList
//           ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//                Tüm elementlerin uzunluğunu döndürün
//                Örneğin;
//                 ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//               Tüm Stringlerin uzunluklarını yazdırın;
//                  cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> cities = new ArrayList<>();
        cities.add("New jersey");
        cities.add("New york");
        cities.add("Ohio");
        cities.add("Florida");
        cities.add("Boston");

        getlength(cities);
    }

    public static ArrayList<String> getlength(ArrayList<String> cities) {

        for (int i = 0; i < cities.size(); i++) {

            for (int j = 0; j < cities.get(i).length(); j++) {

            }
            System.out.print(cities.get(i).length() + ", ");

        }
        return cities;
    }
}