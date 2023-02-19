package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {

        System.out.println("Proqram islemeye basladi");
        String sentence = ""; // ; qoyulmayanda  COMPILE ERROR
        char letter = sentence.charAt(7); // bu satiri en son elave etdik RUNTIME error
        System.out.println("Proqram bitti");


    }
}
// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.