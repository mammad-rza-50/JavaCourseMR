package Gun34._02_Sample;

import java.lang.reflect.Type;

public class SchoolMain {
    public static void main(String[] args) {


        PrimaryStudent primaryStudent = new PrimaryStudent("Ayhan", StudentType.Primary, "Math");
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("Memmed", StudentType.High, "Java");
        HighSchoolStudent highSchoolStudent1 = new HighSchoolStudent("Nureddin",StudentType.Middle,"Tester" );

        System.out.println(primaryStudent);
        System.out.println(highSchoolStudent);
        System.out.println(highSchoolStudent1);
    }
}
