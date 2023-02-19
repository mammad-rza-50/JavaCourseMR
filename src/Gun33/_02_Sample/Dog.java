package Gun33._02_Sample;

public class Dog extends Animal{

    public Dog(String color, int weight, String genus) {
        super(color, weight, genus);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Hurdu");

    }
}
