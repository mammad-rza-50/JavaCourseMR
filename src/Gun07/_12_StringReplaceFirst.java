package Gun07;

public class _12_StringReplaceFirst {
    public static void main(String[] args) {
        //   // replaceFirst : bir string içindeki karakter(leri) verilenle değiştirir.Sadece ilkini


        String text = "Hello World";

        System.out.println("text.replaceFirst(\"e\",\"a\") = " + text.replaceFirst("e","a"));
        System.out.println("text.replaceFirst(\"ld\",\"s\") = " + text.replaceFirst("ld","s"));
        System.out.println(text.replaceFirst("l","I"));
    }
}
