package Gun35._02_Polymorphism;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Hurdu");
    }

    public void sniffed() {
        System.out.println("Kokladi");
    }
}
