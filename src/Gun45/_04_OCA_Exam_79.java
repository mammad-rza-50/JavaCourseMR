package Gun45;

public class _04_OCA_Exam_79 {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if (arr[i].equals("D")) {
                System.out.println("Work Done"); //A B C D Work Done
                break;
            }
            continue;
        }
    }
}