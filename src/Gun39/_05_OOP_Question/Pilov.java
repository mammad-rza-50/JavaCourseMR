package Gun39._05_OOP_Question;

public class Pilov implements IFood{

    void fry(){
        System.out.println("Qizardilir");
    }
    void boil(){
        System.out.println("Qaynadilir");
    }
    @Override
    public void taste() {
        System.out.println("Enfes pilov Afiyet olsun");}

    @Override
    public double fee() {
        return 4;
    }
}
