package Gun35._02_Polymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound() {
        System.out.println("Ses cikardi");
    }

    public void setName(String name) {
        this.name = name;
    }


}
