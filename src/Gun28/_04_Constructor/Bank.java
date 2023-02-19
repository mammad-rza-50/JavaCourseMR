package Gun28._04_Constructor;

public class Bank {
    String name;
    int branchesNumber;
    int buildYear;

    public Bank() {
    }

    public Bank(String name, int buildYesr) {
        this.name = name;
        this.buildYear = buildYesr;
    }

    public Bank(String name, int branchesNumber, int buildYesr) {
        this.name = name;
        this.branchesNumber = branchesNumber;
        this.buildYear = buildYesr;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", branchesNumber=" + branchesNumber +
                ", buildYesr=" + buildYear +
                '}';
    }
}
