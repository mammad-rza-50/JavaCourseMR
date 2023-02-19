package Repeat_04.OOP_Inherience;

public class Employer {
    String adi;
    String soyadi;
    String tel;
    String tcNo;
    String departmani;

    public Employer() {
        System.out.println("GM oluşturuldu");
    }

    public Employer(String adi, String soyadi, String tel, String tcNo, String departmani) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.tel = tel;
        this.tcNo = tcNo;
        this.departmani = departmani;
    }

    void maasYaz()
    {

    }
}
