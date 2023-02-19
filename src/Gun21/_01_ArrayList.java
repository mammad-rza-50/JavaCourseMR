package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        // dizi, array : uzunlugu sonradan deyisdirmek olmur
        int[] array = new int[7]; // Array 7 elemnal;i sonradan deyisdirmek olmur

        // boyutu dinamik olsun eleman artirdiqca uzansin
        // silindikce azalsin
        // ArrayList: uzunlugunu qabaqcada vermeye ehtiyyac yokdur
        // uzunlugu baslangicda 0 artirdiqca artar silindikce azalar

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
        System.out.println("names = " + names);

        names.add("Rzayev");    // size 1---index 0
        names.add("Memmed");    // size 2---index 1
        names.add("Aynur");     // size 3---index 2
        names.add("Nureddin");  // size 4 --index 3

        System.out.println("names = " + names);
        System.out.println("names = " + names.size());

        names.add(3,"Ayhan");        // verilen indexe elave edir ve
                                                 // sonrakilar surusdurur saga
        System.out.println("Index 3 Ayhan elave edilir= " + names);


        names.set(0,"Rzayevler");  // verilen indexeki elemani silib deyisir
        System.out.println("0 indexi silib verilen ile deyisir = " + names);

        boolean isHave = names.contains("Ayhan");   // isHave
        System.out.println("Ayhan isHave = " + isHave);

        names.remove("Ayhan");  // name silir
        System.out.println("remove Ayhan names = " + names);

        names.remove(1);   // indexdeki name silir
        System.out.println("remove 1 index names = " + names);

        int indexOfAynur = names.indexOf("Aynur");
        System.out.println("indexOfAynur = " + indexOfAynur);

        String firstName = names.get(0); // verilen indexin deyerini verir
        System.out.println("Verilen indexdeki deyeri verir = " + firstName);

        names.clear();  // hamisini silir
        System.out.println("Clear all" + names);



    }
}
