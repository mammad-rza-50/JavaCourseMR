package Gun07;

public class _02_StringEqualsIgnoreCase {
    public static void main(String[] args) {
// equals ayni calisir sadece boyuk kicik fark etmez
        String s1 = "SALAM";
        String s2 = "Salam";
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equalsIgnoreCase(s2)= "+ s1.equalsIgnoreCase(s2));
    }
}
