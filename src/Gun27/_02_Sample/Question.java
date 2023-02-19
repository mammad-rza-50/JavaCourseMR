package Gun27._02_Sample;

public class Question {

    // Math sınıfndaki metodlarıdan 5 tanesini
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {

        int max = MyMath.getMax(7,12);
        int min = MyMath.getMin(7,12);
        int rnd = MyMath.getRandom(12);
        double usSonuc = MyMath.getUsAl(2,7);
        double kareKok = MyMath.getKareKok(25);

        System.out.println("Max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("UsSonuc = " + usSonuc);
        System.out.println("KareKok = " + kareKok);



    }
}
