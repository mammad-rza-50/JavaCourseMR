package Gun35.Question;

public class Student extends Person {
    private String branch;


    public Student(String name, String surName, String task, String branch) {
        super(name, surName, task);
        setBranch(branch);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


}
