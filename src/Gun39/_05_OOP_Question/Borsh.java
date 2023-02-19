package Gun39._05_OOP_Question;

public class Borsh implements IFood{

    void boil(){
        System.out.println("Qaynadilir");
    }
    void eatTomorrow(){
        System.out.println("Etler terevezler elave edilir");
    }

    @Override
    public void taste() {
        System.out.println("Enfes Borsh Afiyet olsun");
    }

    @Override
    public double fee() {
        return 3;
    }
}
