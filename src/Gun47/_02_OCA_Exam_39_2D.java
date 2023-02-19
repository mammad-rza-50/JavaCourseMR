package Gun47;

public class _02_OCA_Exam_39_2D {
    public static void main(String[] args) {

        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for (String[] c : shirts) {
            for (String s : c) {
                System.out.print(s + ":");
            }   // dogru cavab
        }

//        for (int i = 1; i < 2; i++) {
//            for (int j = 1; j < 2; j++) {
//                System.out.print(shirts[i][j] + ":");
//            }// medium:
//        }
//
//        for (int i = 0; i < 2; ++i) {
//            for (int j = 0; j < i; ++j) {
//                System.out.print(shirts[i][j] + ":");
//            }// small:
//        }
//        for (int i = 0; i <= 2; i++) {
//            for (int j = 0; j <=2; j++) {
//                System.out.print(shirts[i][j] + ":");
//                j++;
//            } //ArrayIndexOutOfBoundsException: 2
//            i++;
//        }
    }
}
