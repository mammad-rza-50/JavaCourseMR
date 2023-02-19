package Gun35.Question;

public class SchoolMain {
    public static void main(String[] args) {

        Student student1 = new Student("Nuru", "Rzayev", "Student", "Sat");
        Employer employer1 = new Employer("Memmed", "Rzayev", "Manager", "Java");
        Person.infoWrite(student1);
        Person.infoWrite(employer1);

    }

}
