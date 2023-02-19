package Gun45;

public class _10_OCA_Exam_16_2D {
    public static void main(String[] args) {

        String[][] arr =
                {
                        {"A", "B", "C"},
                        {"D", "E"}
                };

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " "); // A B C D E
                if (arr[i][j].equals("B")) { // burada if hec bir etkisi yox
                    // cunki bunda sonra kod yoxdur
                    continue;  // burada tesiri yoxdur cunki ozunden sonra kod yoxdur
                }
            }
            continue; // burada tesiri yoxdur cunki ozunden sonra kod yoxdur
        }
    }
}
