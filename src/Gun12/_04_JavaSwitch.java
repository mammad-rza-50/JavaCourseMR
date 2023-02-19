package Gun12;

import java.util.Scanner;

public class _04_JavaSwitch {
    public static void main(String[] args) {
        // girilen reqeme gore heftenin gununu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Heftenin gunu= ");
        int hefteGun = scan.nextInt();
        switch (hefteGun) {

            case 1: System.out.println("Bazarertesi"); break;
            case 2: System.out.println("Cersenbe aksami");break;
            case 3: System.out.println("cersenbe");break;
            case 4: System.out.println("cume aksami");break;
            case 5: System.out.println("Cume");break;
            case 6: System.out.println("Senbe");break;
            case 7: System.out.println("Bazar");break;
            default: System.out.println("Sehv daxil edildi!!!!");

        }


    }
}
