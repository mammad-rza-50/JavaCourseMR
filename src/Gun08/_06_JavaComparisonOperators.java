package Gun08;

public class _06_JavaComparisonOperators {
    public static void main(String[] args) {

        int a = 12;
        int b = 12;    // = teyin etmek  == berabermi

        System.out.println("a bye berabermi = " + (a == b));  // true
        System.out.println("(a!=b) = " + (a != b));           // false

        System.out.println("(a>b) = " + (a > b));             // false
        System.out.println("(a<b) = " + (a < b));             // false


        System.out.println("(a<=b) = " + (a <= b));           //true
        System.out.println("(a>=b) = " + (a >= b));           //true


    }
}
