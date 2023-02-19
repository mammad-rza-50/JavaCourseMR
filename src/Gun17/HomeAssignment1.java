package Gun17;


public class HomeAssignment1 {
    public static void main(String[] args) {

        //  Bu String'i oluşturun. "Removes white space from both ends of a string"
        //  String'deki kelime sayısını yazdırınız.

        String sentence = "Removes white space from both ends of a string";

        int toplam=0;

        String[] words = sentence.trim().split(" ");

        for (int i = 0; i < words.length; i++) {

         toplam++;
        }
        System.out.println("String'deki toplam kelime sayısı= " + toplam);


        // 2 yontem

        String str1 =  "Removes white space from both ends of a string";
        String[] str2 = str1.split(" ");
        System.out.println("kelime sayısı: " + str2.length);


    }
}
