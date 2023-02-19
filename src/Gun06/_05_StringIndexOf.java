package Gun06;

public class _05_StringIndexOf {
    public static void main(String[] args) {
        // indexOf gibi çalışır bu aramaya baştan başlar
        // lastIndexOf ise : aramaya sondan başlar.
        // 01234  : harflerin oda numaraları 0 dan başlar: index.
        // Bugün

        //              0123456789

        // D nin index i kaçtır
        // M nin index i kaçtır
        // 0(506)3445567 -> ( in oda numarası kaç tır
        // Verilen karakter(ler)in string içindeki INDEX ini verir


        String sentence = "Hello World";
        System.out.println("sentence.IndexOf(W)= "+ sentence.indexOf("W"));
        System.out.println("sentence.IndexOf(r)= "+ sentence.indexOf("r"));
        System.out.println("sentence.IndexOf(ll)= "+ sentence.indexOf("ll"));
        System.out.println("sentence.IndexOf( )= "+ sentence.indexOf(" "));
        System.out.println("sentence.IndexOf(H)= "+ sentence.indexOf("H"));
        System.out.println("sentence.IndexOf(H)= "+ sentence.indexOf("w")); // -1 yok
        System.out.println("sentence.IndexOf(d,7)= "+ sentence.indexOf("l",4));

        // 7 l yı aramaya 4(dahil) nolu index ten sonra başla

    }
}
