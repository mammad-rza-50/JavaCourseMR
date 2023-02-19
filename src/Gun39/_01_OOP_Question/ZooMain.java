package Gun39._01_OOP_Question;

public class ZooMain {
    public static void main(String[] args) {

        Cat cat = new Cat("Mestan",false,"01/01/2017");
        System.out.println(cat);
        cat.theFood();cat.foodAmount();cat.dailySleepTime();cat.voise();  // belede olar
        Eagle eagle = new Eagle("Qara qartal",true,"06/06/2015");
        System.out.println(eagle);
        eagle.theFood();eagle.foodAmount();eagle.dailySleepTime();cat.voise(); // belede olar
    }
}
