package Gun33.Question;

public class Employer {
    private String name;
    private double salary;
    private double salaryFloorNo;

    public Employer(String name, double salary, double salaryFloorNo) {
        setName(name);
        setSalary(salary);
        setSalaryFloorNo(salaryFloorNo);
    }
    public double salaryAccount(){

       return  (salary * salaryFloorNo);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryFloorNo() {
        return salaryFloorNo;
    }

    public void setSalaryFloorNo(double salaryFloorNo) {
        this.salaryFloorNo = salaryFloorNo;
    }

    @Override
    public String toString() {
        return "Employer{" +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", salaryFloorNo=" + salaryFloorNo +
                ", Maas" + salaryAccount() +
                '}';
    }
}
