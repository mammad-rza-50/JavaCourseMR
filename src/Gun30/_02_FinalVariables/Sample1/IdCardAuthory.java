package Gun30._02_FinalVariables.Sample1;

public class IdCardAuthory {
    public static void main(String[] args) {

    // final : değer atandıktan sonra değiştirilmeyi engelliyor
    // bu sebeple, hem sabit değerler için, hem de sonradan
    // değişmesini istemediğimiz değerler için kullanılır
    // static sayac ise: her yeni nesne oluşturulduğunda
        // yeni artan değer almasını sağlıyor

        Citizen citizen1 = new Citizen("Memmed Rzayev");
        Citizen citizen2 = new Citizen("Nureddin Rzayev");
        Citizen citizen3 = new Citizen("Ayhan Rzayev");

        System.out.println("citizen1 = " + citizen1);
        System.out.println("citizen2 = " + citizen2);
        System.out.println("citizen3 = " + citizen3);


    }
}
