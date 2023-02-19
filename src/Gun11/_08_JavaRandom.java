package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {
// Math.Random ()-sayi uretir. 0--0,9999999999999  arasi uretir

 double randomSayi = Math.random();
        System.out.println("randomSayi = " + randomSayi);

        int randomTamSayi = (int)(Math.random()*7);
        System.out.println("randomTamSayi = " + randomTamSayi);


    }
}


