package Gun28._01_Constructor;

public class School {
    public static void main(String[] args) {

        // 1-way
        Student std1 = new Student();  // nesne olma ani
        std1.id = 1;                   // ozelliklerin deyerlerinin verilmesi
        std1.name = "Memmed";
        std1.surName = "Rzayev";
        std1.clas = 7;
        System.out.println("std1.name = " + std1.name);
        System.out.println("std1.surName = " + std1.surName);
        System.out.println("std1.id = " + std1.id);
        System.out.println("std1.clas = " + std1.clas);

        // 2-way

        Student std2 = new Student(2, "Nureddin", "Rzayev", 5);

        System.out.println("std2.name = " + std2.name);

        // 3-way

        Student std3 = new Student(3, "Ayhan", "Rzayev");
        System.out.println("std3.name = " + std3.name);

    }
}
