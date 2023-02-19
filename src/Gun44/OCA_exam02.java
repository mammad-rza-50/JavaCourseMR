package Gun44;

public class OCA_exam02 { // sual 21:
    public static void main(String[] args) {

        // What is the result? sual21

        int[] arr = {1, 2, 3, 4};
        int i = 0;

        do {
            System.out.print(arr[i] + " "); //1 2 3 4 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
            i++;
        } while (i < arr.length + 1); // burada 5 ci parametresi yoxdur

    }
}
