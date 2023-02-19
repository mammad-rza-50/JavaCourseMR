package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {

        helloWrite();
        helloWriteName("Memmed");
        numberWrite(7);

    }
    public static void helloWrite(){
        System.out.println("Hello Java");
        System.out.println("Hello Memmed");
    }
    public static void helloWriteName(String name){

        System.out.println(name + " hello");
    }

    public static void numberWrite(int number){

        for (int i = 0; i < number; i++) {

            System.out.println("Hello");
        }
    }
}
