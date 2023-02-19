package Gun25._05_Question;

import javafx.concurrent.Worker;

import java.util.*;

public class WorkerPayroll {
    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        ArrayList<WorkersInfo> WrkInf = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            WorkersInfo Wrkr = new WorkersInfo();

            System.out.print("Fullname= ");
            Wrkr.fullName = scanStr.nextLine();
            System.out.print("PayrollNo= ");
            Wrkr.payrollNo = scanInt.nextInt();
            System.out.print("Salary= ");
            Wrkr.salary = scanInt.nextInt();
            WrkInf.add(Wrkr);
        }
        avarageSalary(WrkInf);
        salaryMaxMin(WrkInf);

    }

    public static void avarageSalary(ArrayList<WorkersInfo> WrkInf) {

        int total = 0;

        for (WorkersInfo Wrkr : WrkInf) {

            total = total + Wrkr.salary;

        }
        System.out.println("Maas ortalamasi= " + total / WrkInf.size());
    }

    public static void salaryMaxMin(ArrayList<WorkersInfo> WrkInf) {

        int salaryMax = 0;

        for (WorkersInfo slrMx : WrkInf) {

            if (salaryMax < slrMx.salary)

                salaryMax = slrMx.salary;
        }
        System.out.println("salaryMax = " + salaryMax);

        int salaryMin = salaryMax;

        for (WorkersInfo slrMn : WrkInf) {

            if (salaryMin > slrMn.salary)

                salaryMin = slrMn.salary;
        }
        System.out.println("salary min= " + salaryMin);
    }

}

