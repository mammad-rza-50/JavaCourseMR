package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethodQuestion {
    public static void main(String[] args) {

        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner scan = new Scanner(System.in);
        int[] arrays = new int[5];

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(i + "-ci sayi girin= ");
            arrays[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arrays));
        minArray(arrays);
        maxArray(arrays);
        middleArray(arrays);
    }
    public static void minArray(int[]arrays){

        Arrays.sort(arrays);
        System.out.println("Min Sayi" + arrays[0]);

//    public static void minArray(int[] arrays) {
//        int minArray = arrays[0];
//        for (int i = 0; i < arrays.length; i++) {
//            if (minArray > arrays[i]) {
//                minArray = arrays[i];
//            }
//        }
//        System.out.println("MinArray = " + minArray);
    }

    public static void maxArray(int[]arrays){

        Arrays.sort(arrays);
        System.out.println("Max sayi= " +arrays[arrays.length-1]);
//    public static void maxArray(int[] arrays) {
//        int maxArray = arrays[0];
//        for (int i = 0; i < arrays.length; i++) {
//            if (maxArray < arrays[i]) {
//                maxArray = arrays[i];
//            }
//        }
//        System.out.println("MaxArray = " + maxArray);
    }

    public static void middleArray(int[] arrays) {
        double totalArrays = 0;
        for (int i = 0; i < arrays.length; i++) {

            totalArrays += arrays[i];
        }
        double middleArray = (totalArrays / arrays.length);
        System.out.println("MiddleArray = " + middleArray);
    }

}


