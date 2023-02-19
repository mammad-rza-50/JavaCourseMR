package Gun32._01_Encapsulation;

public class ManMain {
    public static void main(String[] args) {

        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

        Man man1 = new Man();

        man1.setname("Memmed");
        man1.setSurName("Rzayev");
        man1.ageAssign(42);
        System.out.println(man1.ageGive());
        System.out.println("man1.getname() = " + man1.getname());
        System.out.println("man1.getSurName() = " + man1.getSurName());
        System.out.println("man1 = " + man1);
    }
}
