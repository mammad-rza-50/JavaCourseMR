package Gun39._01_OOP_Question;

public class Eagle extends Animal{
    public Eagle(String name, boolean wild, String bornYear) {
        super(name, wild, bornYear);
    }

    @Override
    void theFood() {
        System.out.println(getName()+" et yeyer");
    }

    @Override
    void foodAmount() {
        System.out.println(getName()+" 1 gunde --> 2 kq ");
    }

    @Override
    void dailySleepTime() {
        System.out.println(getName()+" gun erzinde 8 saat yatir");
    }

    @Override
    void voise() {
        System.out.println(getName()+ " kartal sesi cikardir");
    }
}
