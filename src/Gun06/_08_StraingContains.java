package Gun06;

public class _08_StraingContains {
    public static void main(String[] args) {
        //contains : bir stringin icerisinde karakter(lerin) var olub olmadigini
        //boolean cinsinden yoxlayir true ve ya false

        String sentence = "Hello World";

        boolean isHave = sentence.contains("W");
        System.out.println("W= " + isHave);
        System.out.println(sentence.contains("ll"));
        System.out.println(sentence.contains("w"));




    }
}
