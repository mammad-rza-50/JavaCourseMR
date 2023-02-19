package Gun38._02_Abstract_Question;

public abstract class Picture {
    private String name;

    abstract double area();  // abstract

    abstract double perimetre(); // abstract

    public void draw() { // somut yeni doldurulan metod

        System.out.println(name + " adli sekil cekildi");

    }

    @Override
    public String toString() {
        return "Picture: " +
                "name='" + name + '\'' +
                "\narea= " + area() + '\'' +
                "\nperimetre= " + perimetre() + '\'' +
                "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
