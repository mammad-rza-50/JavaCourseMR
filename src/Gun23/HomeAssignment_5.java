package Gun23;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeAssignment_5 {
    public static void main(String[] args) {

//        5- 2D ArrayList
//
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//
//        Store all the elements in one arraylist and print the arraylist
//
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//
//                **Örnek:**
//
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]

        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> storeAll = new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[i].length; j++) {

                storeAll.add(arrays[i][j]);
            }
        }
        System.out.println("storeAll = " + storeAll);
    }
}
