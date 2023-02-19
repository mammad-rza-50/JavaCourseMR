package Gun34._02_Sample;

public class HighSchoolStudent extends Student{
    private String branch;


    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public HighSchoolStudent( String name, StudentType type, String branch) {
        super( name, type);
        setBranch(branch);
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "branch='" + getBranch() + '\'' +
                "} " + super.toString();
    }
}
