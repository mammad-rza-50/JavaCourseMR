package Gun33._02_Sample;

public class Cat extends Animal{

    public Cat(String color, int weight, String genus) {
        super(color, weight, genus);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Myovladi");
    }
}
