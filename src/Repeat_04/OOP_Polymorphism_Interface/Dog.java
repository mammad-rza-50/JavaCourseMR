package Repeat_04.OOP_Polymorphism_Interface;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Hurer");
    }

    @Override
    public void food() {
        System.out.println("Et yiyer");
    }

    void sniffed(){

        System.out.println("Kokladi");
    }
}
