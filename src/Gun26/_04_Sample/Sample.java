package Gun26._04_Sample;

public class Sample {

    /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

         ipucu  :hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                 ondan sonra toplam alarak çıkartınız  */

    public static void main(String[] args) {

        Customer customer1 = new Customer();

        customer1.elktrAcc = new ElektrikAccount();

        customer1.name = "Memmed Rzayev";
        customer1.elktrAcc.consumptionAdd(50);
        customer1.elktrAcc.consumptionAdd(60);
        customer1.elktrAcc.consumptionAdd(70);
        customer1.elktrAcc.totalConsumptionWhrite();
        customer1.elktrAcc.billWhrite(customer1.name);



    }
}
