package Gun39._05_OOP_Question;

public class Lahmacun implements IFood{

    void dough(){
        System.out.println("Xemir acildi");
    }

    void addMeat(){
        System.out.println("Et elave edildi");
    }

    void bake(){
        System.out.println("Bisirildi");
    }
    @Override
    public void taste() {
        System.out.println("Enfes Lahmacun Afiyet olsun");
    }

    @Override
    public double fee() {
        return 3;
    }
}
