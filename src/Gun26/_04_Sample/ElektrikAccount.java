package Gun26._04_Sample;

public class ElektrikAccount {

    double unitPrice = 0.7;

    double bill = 0;

    int totalConsumption = 0;

    public void consumptionAdd( int monthConsumption) {

        totalConsumption+=monthConsumption;

    }
    public void totalConsumptionWhrite(){

       // System.out.println("TotalConsumptionWhrite = " + totalConsumption);
    }

public void billWhrite(String name){

        bill=totalConsumption*unitPrice;
    System.out.println("********************************");
    System.out.println("           Yours bill");
    System.out.println("********************************");
    System.out.println("Customer name= " + name);
    System.out.println("Total consumption= " + totalConsumption);
    System.out.println("Total price= " + Math.round(bill));
    System.out.println("********************************");

}

}
