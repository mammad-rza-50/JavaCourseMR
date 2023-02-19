package Gun47;

public class _01_OCA_Exam_82_2D {
    public static void main(String[] args) {

        String[][] chs = new String[2][];
        chs[0] = new String[2]; // 2
        chs[1] = new String[5]; // 5
        int i = 97;

        for (int j = 0; j < chs.length; j++) {
            for (int k = 0; k < chs.length; k++) {
                chs[j][k] = "" + i; // i-yi avtomatik stringe cevirir
                // 0  0  =    97;  string kodu
                //  0  1  =    98;  string kodu
                //  1  0  =    99;  string kodu
                //  1  1   =  100;  string kodu
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

