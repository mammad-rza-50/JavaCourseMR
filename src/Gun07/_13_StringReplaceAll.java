package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler
        // (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak
        
        String text = "Hello World1214";
        System.out.println("text = " + text);
        System.out.println("text.replaceAll(\"[elr]\",\"*\") = " + text.replaceAll("[elr]","*"));
        System.out.println("text.replaceAll(\"[a-z]\",\"*\") = " + text.replaceAll("[A-Z]","*"));
        System.out.println("text.replaceAll(\"[a-z]\",\"*\") = " + text.replaceAll("[a-z]","*"));
        System.out.println("text.replaceAll() = " + text.replaceAll("[0-9]","*"));
        
    }
}
