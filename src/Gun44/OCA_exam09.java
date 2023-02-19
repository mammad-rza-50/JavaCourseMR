package Gun44;

public class OCA_exam09 {  // soru 44
    public static void main(String[] args) {

        int[] intArr = {8,16,32,64,128};

        for (int i = 0; i < intArr.length; i++) {

            System.out.print(intArr[i] +" "); // 8,16,32,64,128
        }

        System.out.println();

        for (int i : intArr){

            System.out.print(i + " "); // 8,16,32,64,128
        }
    }
}
