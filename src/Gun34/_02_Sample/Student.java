package Gun34._02_Sample;

public class Student {
    private final int ID;
    private String name;
    private StudentType type;

    private static int IdCount = 1;

    public Student(String name, StudentType type) {
        this.ID = IdCount++;
        setName(name);
        setType(type);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", type=" + getType() +
                '}';
    }
}


