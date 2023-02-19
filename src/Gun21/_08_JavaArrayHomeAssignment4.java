package Gun21;

import java.util.ArrayList;

public class _08_JavaArrayHomeAssignment4 {
    public static void main(String[] args) {

//
//    4.   Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//                **Örnek:**
//                        **Girdi:**
//                                  {  [ 1, 2, 3 ],
//                                     [ 4, 5, 6 ],
//                                     [ 7, 8, 9 ]  };
//                                                   **Çıktı:** [1,2,3,4,5,6,7,8,9]

        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[i].length; j++) {

                arrayList.add(arrays[i][j]);
            }
        }
        System.out.println(arrayList);
    }
}
