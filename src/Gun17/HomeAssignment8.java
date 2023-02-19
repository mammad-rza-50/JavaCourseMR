package Gun17;

public class HomeAssignment8 {
    public static void main(String[] args) {

//        int Array oluşturun ve elemanları : 5,6,8,12,14,19
//
//        Eğer sayı çiftse topla, tekse çıkar.
//
//                **Örneğin:**
//
//           **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//
//          Toplamlarını yazdırın.

        int[] numbers = {5, 6, 8, 12, 14, 19};
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                total += numbers[i];
            else
                total -= numbers[i];
        }
        System.out.println("Total = " + total);
    }
}
