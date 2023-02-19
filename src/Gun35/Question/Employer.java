package Gun35.Question;

public class Employer extends Person {

    private String department;


    public Employer(String name, String surName, String task, String department) {
        super(name, surName, task);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
