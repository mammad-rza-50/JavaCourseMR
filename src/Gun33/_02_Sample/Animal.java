package Gun33._02_Sample;

public class Animal {  // super class , base class, parent

    private String color;
    private int weight;
    private String genus;

    public Animal(String color, int weight, String genus) {
        setColor(color);
        setWeight(weight);
        setGenus(genus);
    }
    public void speak(){

        System.out.println("Ses cixartdi...");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }
}
