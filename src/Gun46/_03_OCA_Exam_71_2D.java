package Gun46;

public class _03_OCA_Exam_71_2D {
    public static void main(String[] args) {

        int[][] arr = new int[2][4];

        arr[0] = new int[]{1, 3, 5, 7}; // satir 0
        arr[1] = new int[]{1, 3};    // satir 1

        for (int[] a : arr) { // a burada satir sayisidir

            for (int i = 0; i < arr.length; i++) { // arr.lenght satir sayisini verir

                //   for (int i = 0; i < a.length; i++) { // bele olsa idi satirin butun elementleri yazar

                System.out.print(a[i] + " ");
            }
        }
        System.out.println(); //arr.lenght olanada:1 3 1 3  // a.lenght olanda : 1 3 5 7 1 3
    }
}
