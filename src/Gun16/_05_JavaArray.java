package Gun16;

public class _05_JavaArray {
    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] kanallar = {"TRT","ATV","SHOW","FOX","TV8"};

        int random = (int)(Math.random()*5);

        System.out.println("Random kanal= "+kanallar[random]);

        }

    }
