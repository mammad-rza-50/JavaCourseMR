package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {
        // equals : 2 stringin birbirine eşit olup olmadığını kontrol eder
        // sonuç boolean


        String s1 = "SALAM";
        String s2 = "Salam";

        boolean berabermi = s1.equals(s2);
        System.out.println("berabermi = " + berabermi);
        System.out.println("s1.equals(s2)"+s1.equals(s2));
        System.out.println("s1.equals(SALAM)="+s1.equals("Salam"));



    }
}
