package Gun34._03_Sample;

public class SchoolMain {
    public static void main(String[] args) {


        PrimaryStudent primaryStudent = new PrimaryStudent("Memmed", StudentType.Primary, "Math");
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("Rzayev", StudentType.High, "Java");
        HighSchoolStudent highSchoolStudent1 = new HighSchoolStudent("Nureddin", StudentType.High,"Tester" );

        System.out.println(primaryStudent);
        System.out.println(highSchoolStudent);
        System.out.println(highSchoolStudent1);
    }
}
