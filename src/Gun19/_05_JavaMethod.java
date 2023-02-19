package Gun19;

public class _05_JavaMethod {

    //method yazmaq olar

    public static void main(String[] args) {    // esas method diger metodlar buradan cagirilir

        Math.max(12,14);  // veri verilmis, geriye veri qaytarir
        Math.random();    // ancaq veri veriyor
                          //  ve basqalar

        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");

        helloWrite();   // kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
        helloWrite();    // mainin daha kolay anlaşılabilir olur.
        helloWrite();    // fonksiyonu çağırma şekli


    }

    //method yazmaq olar

    public static void helloWrite(){

        System.out.println("Hello Java");
        // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
        // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
        // temiz kod için

        // buraya metodlar yazılabilir
    }

}
