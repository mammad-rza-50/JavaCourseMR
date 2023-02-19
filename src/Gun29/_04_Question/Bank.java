package Gun29._04_Question;

public class Bank {
    // Hesap (yatan(int), cekilen(int), bakiye(int))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {

        Customer cstm = new Customer();
        cstm.customerNo = 1;
        cstm.name = "Memmed";
        cstm.surname = "Rzayev";

        cstm.customerAccount.moneyAdd(100);
        cstm.customerAccount.moneyAdd(200);
        cstm.customerAccount.withDrawnMoney(50);


        System.out.println(cstm.customerAccount);

    }
}
