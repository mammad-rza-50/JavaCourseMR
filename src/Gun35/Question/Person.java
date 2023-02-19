package Gun35.Question;

public class Person {

    private String name;
    private String surName;
    private String task;

    public Person(String name, String surName, String task) {
        setName(name);
        setSurName(surName);
        setTask(task);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }



    public static void infoWrite(Person getPerson) {
        System.out.println("*******Kimlik Infosu*******");
        System.out.println("Name = " + getPerson.getName());
        System.out.println("SuName = " + getPerson.getSurName());
        System.out.println("Task = " + getPerson.getTask());

        if (getPerson instanceof Student) {
            System.out.println("Student's branch = " + ((Student) getPerson).getBranch());
            System.out.println("Student name = " + getPerson.getName());

        } else if (getPerson instanceof Employer) {
            System.out.println("Employer's Name= " + getPerson.getName());
            System.out.println("Employer's department= " + ((Employer) getPerson).getDepartment());

        }
    }
}
