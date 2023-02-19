package Gun39._01_OOP_Question;

public abstract class Animal {
    private  final int id;
    private String name;
    private boolean wild;
    private String bornYear;

    private static int idCount = 1;

    abstract void theFood();
    abstract void foodAmount();
    abstract void dailySleepTime();
    abstract void voise();

    public Animal(String name, boolean wild, String bornYear) {
        setName(name);
        setWild(wild);
        setBornYear(bornYear);
        this.id=idCount++;
    }

    @Override
    public String toString() {
//        System.out.print("Yiyeceyi= ");theFood();
//        System.out.print("Yemek mikdari= ");foodAmount();
//        System.out.print("Yatmaq vaxti= ");dailySleepTime(); // bele de olar
//        System.out.print("Sesi= ");voise();
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wild=" + wild +
                ", bornYear='" + bornYear + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public String getBornYear() {
        return bornYear;
    }

    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }
}
