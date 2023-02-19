package Gun47;

public class _04_OCA_Exam_152_2D {
    public static void main(String[] args) {
                   // n[0]    n[1]
        int n[][] = {{1, 3}, {2, 4}};

        for (int i = n.length - 1; i >= 0; i--) {

            for (int y : n[i]) {
                System.out.print(y); // n[1]  n[0]
                // 2413 print           24     13
            }
        }
    }
}
