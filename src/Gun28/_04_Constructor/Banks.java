package Gun28._04_Constructor;

public class Banks {

    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        bank1.name = "Milli bank";
        bank1.branchesNumber = 12;
        bank1.buildYear = 2000;

        Bank bank2 = new Bank("Kapital bank",2007);
        Bank bank3 = new Bank("Beynelxalq bank", 14,2010);

        System.out.println("bank1 = " + bank1);
        System.out.println("bank2 = " + bank2);
        System.out.println("bank3 = " + bank3);

    }
}
