package Gun47;

public class _03_OCA_Exam_87_2D {
    public static void main(String[] args) {

        int n[][] = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {

            for (int j = n[i].length - 1; j >= 0; j--) {

                System.out.print(n[i][j]);

                // [1][1] [1][0] [0][1] [0][0]
                //    4     2      3     1   //print
            }
        }
    }
}
