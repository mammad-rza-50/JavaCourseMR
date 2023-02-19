package Repeat_04.OOP_Polymorphism_Interface;

public class Zoo {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.food();
        cat.sound();

        Dog dog = new Dog();
        dog.food();
        dog.sound();

        Animal cat1 = new Cat();
        cat1.food();
        cat1.sound();

        Animal dog1 = new Dog();
        dog1.sound();
        dog1.food();

        giveSound(cat1);
        giveSound(dog1);
    }

    static void giveSound(Animal animal) {

        animal.sound();

        if (animal instanceof Dog)
            ((Dog) animal).sniffed();

        if (animal instanceof Cat)
            ((Cat) animal).scratched();
    }
}
