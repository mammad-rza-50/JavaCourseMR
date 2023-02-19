package Gun44;

public class OCA_exam04_1 {
    public static void main(String[] args) {

        String word;
        String[] words = new String[2];

        System.out.println("words[0] = " + words[0]); // null
        System.out.println("words[1] = " + words[1]); // null

        words[0].concat("Memmed"); // olmayan yere elave etmek olmur

    }
}
