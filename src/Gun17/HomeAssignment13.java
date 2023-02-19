package Gun17;

public class HomeAssignment13 {
    public static void main(String[] args) {
        //	Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"

       //$ işaretlerini kaldırın ve sayıları toplayın. Sayıların toplamını yazdırın.

        String str = "$12 $23 $10 $2 $5 $2";

        String[] arr = str.split(" ");

        int total = 0;

        for (int i = 0; i < arr.length; i++)

        { arr[i] = arr[i].replace("$", "");

            total += Integer.parseInt(arr[i]);
        }
        System.out.println("toplam: " + total);

    }
}
