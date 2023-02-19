package Gun46;

public class _02_OCA_Exam_17_2D {

    public static void main(String[] args) {

        int[][] arr = new int[2][4];

        arr[0] = new int[]{1, 3, 5, 7}; // satir 0
        arr[1] = new int[]{1, 3};    // satir 1

        for (int[] satir : arr) {
            for (int i : satir) {

                System.out.print(i + " ");

            }
            System.out.println();
        }

    }
}
