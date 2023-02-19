package Repeat_04.OOP_Polymorphism_Interface;

public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Miyouuu");
    }

    @Override
    public void food() {
        System.out.println("Sut icer");
    }

    void scratched(){

        System.out.println("Cirmaqladi");
    }
}
