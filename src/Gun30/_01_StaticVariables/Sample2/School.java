package Gun30._01_StaticVariables.Sample2;

public class School {
    public static void main(String[] args) {


        Student student1 = new Student(1,"Memmed Rza");
        Student student2 = new Student(2,"Nureddin Rza");
        Student student3 = new Student(3,"Ayhan Rza");
        // burada Id ni ozumuz verende id ni izlemeye mecburuq
        // hemde xeta etmek ehtimali var

        Student student10 = new Student("Memmed Rzayev");
        Student student11 = new Student("Nureddin Rzayev");
        Student student12 = new Student("Ayhan Rzayev");

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);

        System.out.println("student10 = " + student10);
        System.out.println("student11 = " + student11);
        System.out.println("student12 = " + student12);

    }
}
