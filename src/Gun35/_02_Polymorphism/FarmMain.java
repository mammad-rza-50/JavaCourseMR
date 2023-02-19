package Gun35._02_Polymorphism;


// Setlerden HasSet
// Maplerden HashMAp
// Listlerden ArrayList

//        Polymorphism -
//                       çok formluluk  - Çok çeşitlilik
//                       şizofren bir konu
//
//        :  Bir NESNEN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

// öğretmenin okulda "fizik öğretmeniyim" demesi,
// mahallede "öğretmenim" demesi gibi.


public class FarmMain {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Qarabas");
        dog1.sound(); // hurdu
        dog1.sniffed();// kokladi
        System.out.println("/***********************************************/");
        Cat cat1 = new Cat("Mestan");
        cat1.sound();// miyovladi
        cat1.scratch();// cirmaqladi
        System.out.println("/***********************************************/");
        dogSound(dog1); //kokladi
        catSound(cat1); // cirmaqladi
        System.out.println("/***********************************************/");
        animalSound(dog1);  // hurdu
        animalSound(cat1);  // miyovladi
        System.out.println("/***********************************************/");
        // referans tipi    //obyekt tipi
        Animal animal1 = new Animal("Mouse"); // heyvanlardan 1 sican
        Animal animal2 = new Dog("Alabas"); // heyvanlardan 1 it
        Animal animal3 = new Cat("Mesi"); // heyvanlardan 1 pisik+

        animal1.sound();// umumi heyvan "ses cixardi"
        animal2.sound(); // it sesi "hurdu"
        animal3.sound();// pisik sesei "miyoldadi"
        System.out.println("/***********************************************/");
        animal2.sound(); // hurdu
        //  animal2.sound();  // kopek de olsa hayvan Referansı sebebiyle metodlar kısıtlı
        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yara mı
        //  ((Dog)animal2).sniffed(); // artık diğer metodları kullanabilirim.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü
        ((Dog) animal2).sniffed();  // kokladi
        ((Cat) animal3).scratch(); //cirmaqladi
        System.out.println("/***********************************************/");
    }

    public static void dogSound(Dog dog){

        dog.sound();
    }

    public static void catSound(Cat cat){

        cat.sound();
    }

    public static void animalSound(Animal animal) {
        // bura hem it hem de pisik gelir
       animal.sound();
        // bir classin eslinde kim oldugunu tapma yolu
        if (animal instanceof Dog)  // heyvan eslinde it mi
            ((Dog) animal).sniffed();

        if (animal instanceof Cat)  // heyvan eslinde pisik mi
            ((Cat) animal).scratch();

    }
}
