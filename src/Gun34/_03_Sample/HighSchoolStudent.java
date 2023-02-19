package Gun34._03_Sample;

public class HighSchoolStudent extends student {
    private String branch;

    private static int HighIdCount=1;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public HighSchoolStudent(String name, StudentType type, String branch) {
        super( name, type,HighIdCount++);
        setBranch(branch);
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "branch='" + branch + '\'' +
                "} " + super.toString();
    }
}
