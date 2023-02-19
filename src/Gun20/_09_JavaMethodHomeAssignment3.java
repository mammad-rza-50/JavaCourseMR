package Gun20;

public class _09_JavaMethodHomeAssignment3 {
    public static void main(String[] args) {

//
//        3.   reverseString isminde bir method oluşturun.
//             Bu method bir String'i parametre olarak alsın.
//             Ve bu method, girilen String'i tersten yazsın.
//             Terste yazılmış halini yazdırınız.
//             Örn: String = "Java'yı Seviyorum."
//                      Print: .muroyiveS ıy'avaJ

        reverseString("Javani oyrenirem");

    }

    public static void reverseString(String sentence) {
        String reverseStr = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {

            reverseStr += sentence.charAt(i);
        }
        System.out.println("ReverseStr = " + reverseStr);
    }


}
