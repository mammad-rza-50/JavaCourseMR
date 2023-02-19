package Gun45;

public class _03_OCA_Exam_64 {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

            if (arr[i].equals("C")) {
                continue;
            }
            System.out.println("Work Done");
            break; // break olmasa: A/ Work Done/ B /Work Done /C /D/ Work Done
// break olsa:  A
//              Work Done

        }
    }
}

