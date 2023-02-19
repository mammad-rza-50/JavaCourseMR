package Gun45;

public class _10_OCA_Exam_16_2_2D {
    public static void main(String[] args) {

        String[][] arr =
                {
                        {"A", "B", "C"},
                        {"D", "E"}
                };

        String strinqHarf = null;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                strinqHarf = arr[i][j];
                System.out.print(arr[i][j] + " "); // A B
                if (arr[i][j].equals("B")) {

                    break;
                }
            }
            if (strinqHarf.equals("B")) {

                break;
            }
            continue; // burada tesiri yoxdur cunki ozunden sonra kod yoxdur
        }
    }
}
