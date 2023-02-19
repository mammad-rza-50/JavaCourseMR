package Gun35._02_Polymorphism;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Miyavladi");
    }
    public void scratch(){
        System.out.println("Cirmaqladi");
    }
}
