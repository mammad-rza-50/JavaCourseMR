package Gun07;

public class _08_StringEndsWith {
    public static void main(String[] args) {
        // EndsWith : verilen karakter(ler) ile bitiyor mu
        // sonuc true veya false yani boolean döner


        String text = "Hello World";

        System.out.println("text.endswith(ld) = " + text.endsWith("ld"));
        System.out.println("text.endswith(r) = " + text.endsWith("r"));
        System.out.println("text.endswith(ll) = " + text.endsWith("ll"));
        System.out.println("text.endswith(World) = " + text.endsWith("World"));



    }
}
