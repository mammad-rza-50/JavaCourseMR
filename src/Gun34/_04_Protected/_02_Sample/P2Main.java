package Gun34._04_Protected._02_Sample;

import Gun34._04_Protected._01_Sample.P1Animal;

public class P2Main {
    public static void main(String[] args) {

        P1Animal p1Animal = new P1Animal();
        p1Animal.name = "Dog";

        P2Animal p2Animal = new P2Animal("Cat", "Siam");

        System.out.println(p1Animal.name);
        System.out.println(p2Animal.name );
    }
}
