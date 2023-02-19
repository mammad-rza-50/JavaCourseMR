package Gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class HomeAssignment_3 {
    public static void main(String[] args) {

//   3.   commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//     **ÖRNEĞİN:**
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.

        HashSet<String> countys1 = new HashSet<>();
        countys1.add("Germany");
        countys1.add("England");
        countys1.add("South Africa");
        countys1.add("Brazil");
        countys1.add("USA");
        HashSet<String> countys2 = new HashSet<>();
        countys2.add("Germany");
        countys2.add("China");
        countys2.add("Brazil");
        countys2.add("France");
        countys2.add("USA");

        commonValues(countys1, countys2);

    }
//
//    // 1 way
//    public static ArrayList<String> commonValues(HashSet<String> countys1, HashSet<String> countys2) {
//
//        HashSet<String> unite = new HashSet<>();
//        unite.addAll(countys1);
//        unite.retainAll(countys2);
//        ArrayList<String> retainUnite = new ArrayList<>(unite);
//        System.out.println("RetainUnite = " + retainUnite);
//
//        return retainUnite;


    // 2 way
    public static ArrayList<String> commonValues(HashSet<String> countys1, HashSet<String> countys2) {

        HashSet<String> common = new HashSet<>(countys1);
        common.retainAll(countys2);
        System.out.println(common);
        return new ArrayList<>(common);


    }
}