package Gun07;

public class _11_StringReplace {
    public static void main(String[] args) {
// srting icindeki xarakter(leri) verilenle deyisir
        
        String text = "Hello World";

        System.out.println("text = " + text);
        System.out.println("text.replace(e,a) = " + text.replace("e","a"));
        System.out.println("text.replace(\"World\",\"java\") = " + text.replace("World","Java"));
        System.out.println("text replace (l, bos)= "+ text.replace("l",""));
    }
}
