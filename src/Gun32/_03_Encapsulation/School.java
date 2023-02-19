package Gun32._03_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private int quota;


    private List<Student> students = new ArrayList<>();

    public School(String schoolName, int quota) {
        setSchoolName(schoolName);
        setQuota(quota);

    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getQuota() {
        return quota;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", quota=" + quota +
                ", students=" + students +
                '}';
    }
}
