package Gun45;

public class _01_OCA_Exam_56_1 {
    public static void main(String[] args) {

        String names[] = {"Thomas", "Peter", "Josept"};
        String pwd[] = new String[3];
        int idx = 0;

        for (String n : names) {

            try {

                pwd[idx] = n.substring(2, 6);
                System.out.println(pwd[idx]);
                idx++;

            } catch (Exception error) {
                System.out.println("Invalid name");
                //omas
                //Invalid name
                //sept
            }
        }
    }
}
