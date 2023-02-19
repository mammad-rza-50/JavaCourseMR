package Gun39._02_OOP_Question;

public class AB {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("A.message = " + A.message); // A-dan Hello
        B b = new B(); // constructor calisdi
        System.out.println("A.message = " + A.message); //B den Hello
        A a1 = new A();
        System.out.println("A.message = " + A.message); //B den Hello
    }
}
