package Gun45;

public class _02_OCA_Exam_46 {
    public static void main(String[] args) {

        String names[] = {"Thomas", "Peter", "Josept"};
        String pwd[] = new String[3];
        int idx = 0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2, 6);
                idx++;
            }
        } catch (Exception error) {
            System.out.println("Invalid name");
        }
        for (String p : pwd) {
            System.out.println(p);
//            Invalid name
//            omas
//            null
//            null
        }
    }
}