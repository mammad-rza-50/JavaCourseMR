package Gun34._04_Protected._01_Sample;

public class P1Main {
    public static void main(String[] args) {

        P1Animal p1Animal = new P1Animal();
        p1Animal.age = 7; // default
        p1Animal.name = "Dog"; // public
        p1Animal.genus = "Coban iti";// protected
        // p1Animal.color = "Balck"; erismek olmur privatedir
    }
}