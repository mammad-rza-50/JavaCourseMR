package Gun34._04_Protected._01_Sample;

public class P1Animal {
    public String name; // her yerden, her paketden
    int age; // default sadece oldugu paketten
    protected  String genus; // default kimidir , sadece
    // elave yollar ile diger pakettden elaqe saxlamaq olur
    private String color; // sadece oldugu classdan
}
