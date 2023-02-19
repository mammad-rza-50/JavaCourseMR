package Gun26._02_Sample;

public class Sample {

    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
     // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

    public static void main(String[] args) {

        Person worker1 = new Person();
        worker1.name = "Memmed";
        worker1.surName = "Rzayev";
        worker1.age = 42;

        Person worker2 = new Person();
        worker2.name = "Nureddin";
        worker2.surName = "Rzayev";
        worker2.age = 15;

        // 1 way
        System.out.println("worker1 = " + worker1.name);
        System.out.println("worker1 = " + worker1.surName);
        System.out.println("worker1 = " + worker1.age);

        System.out.println("worker2 = " + worker2.name);
        System.out.println("worker2 = " + worker2.surName);
        System.out.println("worker2 = " + worker2.age);

        // 2 way metodu mainde yazdirmaq
        infoWhrite(worker1);
        infoWhrite(worker2);

        //3 way metodu aid oldugu classda yazidirmaq
        worker1.infoWrhite();
        worker2.infoWrhite();

        // 4 way toString metodunu classda cagirib yazdirmaq

        System.out.println("worker1 = " + worker1);
        System.out.println("worker2 = " + worker2);
        worker1.getBirthYear();
        worker2.getBirthYear();
        System.out.println(worker1.getBirthYear1());
        System.out.println(worker2.getBirthYear1());
        worker1.getInitials();
        worker2.getInitials();
    }

    public static void infoWhrite(Person worker) {
        System.out.println("worker = " + worker.name);
        System.out.println("worker = " + worker.surName);
        System.out.println("worker = " + worker.age);

    }

}
