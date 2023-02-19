package Gun33.Question;

public class CompanyMain {
    public static void main(String[] args) {

        Employer employer1 = new Employer("Nuru",1400,1.2);
        System.out.println("employer1.salaryAccount() = " + employer1);
        GeneralManager generalManager1 = new GeneralManager("Memmed", 4200,1.4,700);
        System.out.println("generalManager1 = " + generalManager1);
    }
}
