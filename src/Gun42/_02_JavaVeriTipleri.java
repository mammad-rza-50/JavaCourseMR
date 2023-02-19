package Gun42;

import java.util.Arrays;

public class _02_JavaVeriTipleri {
    public static void main(String[] args) {

        // primitiv tipler

        int number1 = 12;
        int number2 = 14;
        number1=number2; // number1=14;
        System.out.println("number1 = " + number1);//14

        number1 = 16;
        number2 = 29;
        System.out.println("number1 = " + number1); //16
        System.out.println("number2 = " + number2); // 29

        // Referans tipler
        int[] array1= {7,12,14};
        int[] array2= {37,43};
        System.out.println("array1 = " + Arrays.toString(array1));// 7,12,14
        System.out.println("array2 = " + Arrays.toString(array2)); // 37,43

        array1=array2;
        System.out.println("array1 = " + Arrays.toString(array1));//37,43
        System.out.println("array2 = " + Arrays.toString(array2));//37,43

        array1[0]=80;
        System.out.println("array1 = " + Arrays.toString(array1));//80,43
        System.out.println("array2 = " + Arrays.toString(array2));//80,43

        array2[0]= 85;
        System.out.println("array1 = " + Arrays.toString(array1));//80,85
        System.out.println("array2 = " + Arrays.toString(array2));//80,85

        // Object tiper: Null alabilen ilkel tip
        // String, Integer, Double, Long

        String name1 = "Memmed";
        String name2 = "Nureddin";
        // Referans amma davranisi primitiv
        name1=name2;
        System.out.println("name1 = " + name1); // Nureddin
        System.out.println("name2 = " + name2); // Nureddin

        name1 = "Ayhan";
        System.out.println("name1 = " + name1); // Ayhan
        System.out.println("name2 = " + name2); // Nureddin

        name2 = "Aynur";
        System.out.println("name1 = " + name1); // Ayhan
        System.out.println("name2 = " + name2); // Aynur

        name2=name1;
        System.out.println("name1 = " + name1); // Ayhan
        System.out.println("name2 = " + name2); // Ayhan

    }
}
