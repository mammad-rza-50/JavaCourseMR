package Gun39._01_OOP_Question;

public class Cat extends Animal{
    public Cat(String name, boolean wild, String bornYear) {
        super(name, wild, bornYear);
    }

    @Override
    void theFood() {
        System.out.println(getName()+" sud icer");
    }

    @Override
    void foodAmount() {
        System.out.println(getName()+" 1 gunluk yemek mikdari--> 200q ");
    }

    @Override
    void dailySleepTime() {
        System.out.println(getName()+" 10 saat yatir");
    }

    @Override
    void voise() {
        System.out.println(getName()+ " miyovlayir");
    }
}
