package Gun30._02_FinalVariables.Sample1;

public class Citizen {

    String name;

    final int idNo;// deyisdirilemez  sadece bir defe deyer verilir

    static int idNoCount =1;

    public Citizen(String name) {
        this.idNo = idNoCount++;
        this.name = name;
        // final deyisenlere deyeri bir defe verilir
        // ya da Constructorda verilir
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", idNo=" + idNo +
                '}';
    }
}
