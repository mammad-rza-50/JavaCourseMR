package Gun33.Question;

public class GeneralManager extends Employer {

    private double compensation;

    public GeneralManager(String name, double salary, double salaryFloorNo, double compensation) {
        super(name, salary, salaryFloorNo);
        setCompensation(compensation);
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    public double salaryAccount() {
        return super.salaryAccount()+getCompensation();


    }

    @Override
    public String toString() {
        return "GeneralManager{" + "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", salaryFloorNo=" + getSalaryFloorNo() +
                ", Maas" + salaryAccount() +
                ", compensation=" + compensation +
                '}';
    }
}
