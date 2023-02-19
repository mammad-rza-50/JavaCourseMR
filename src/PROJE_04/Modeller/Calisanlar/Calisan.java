package PROJE_04.Modeller.Calisanlar;

import PROJE_04.Modeller.Departmanlar.Departman;
import PROJE_04.Veritabani.Calisanlar;
import PROJE_04.Veritabani.Departmanlar;

import java.util.ArrayList;
import java.util.Arrays;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        Calisanlar.addACalisan(this);
    }

    // Kullanicinin departman koduna göre, gerekli departman set edilmelidir.
    private void setDepartman(String departmanKodu) {
        /*
            İpucu: Departman listesinin (Veritabani.Departmanlar.DepartmanList) içerisindeki departmanların kodları var,
        bu kodlari donguye tutmak ise yarayabilir.*/
        for (Departman dprmn : Departmanlar.getDepartmanList()) {
            if (dprmn.getDepartmanKodu().equals(departmanKodu)) {
                this.Departman = dprmn;
            }
        }
    }

    // Calisanin ID sinin kendisine özel olduğundan bahsetmistik, ID nin nasil kaydedileceği CalisanKaydetmeProjesiTanıtım.txt
    // içerisinde yer aliyor.
    private void setCalisanId() {
        /*
         İpucu: Detayli anlatim CalisanKaydetmeProjesiTanıtım.txt içerisinde.*/
        this.calisanId = this.Departman.getDepartmanKodu() +
                ((Calisanlar.getCalisanList().size() + 1))
                + this.getCalisanIsimKodu();

    }

    // Calisanin ID sinin sonuna isim kodu eklenmesi için, ismi parçalayan bir method.
    private String getCalisanIsimKodu() {

           /* Basit string metodlari ise isinice cok yarayacaktir fakat dinamik olmasina dikkat edelim... Mesela 2 isim bir
            soyisim girildiğinde hata vermesin.*/
        this.isimKodu += this.adSoyad.charAt(0);
        for (int i = 0; i < this.adSoyad.length(); i++) {
            if (adSoyad.charAt(i) == ' ') {
                this.isimKodu += adSoyad.charAt(i + 1);
            }
        }
        return this.isimKodu;
    }

    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departman getDepartman() {
        return this.Departman;
    }

    // Departman adini verebilmek için bir method
    public String getDepartmanAdi() {
        /*
                İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.*/
        String departman = "";
        if (this.Departman.getDepartmanKodu().equals("YD")) {
            departman = "Yonetim Departmani";
        } else if (this.Departman.getDepartmanKodu().equals("BTD")) {
            departman = "Bilişim Teklonojileri Departman";
        } else if (this.Departman.getDepartmanKodu().equals("IKD")) {
            departman = "Insan Kaynaklari Departmani";
        }
        return departman;
    }

    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {
        /*
            İpucu: Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha
            olabilirdi.*/
        ArrayList<Calisan> calisanList = Calisanlar.getCalisanList();
        for (int i = 0; i < calisanList.size(); i++) {
            if (calisanList.get(i).getCalisanId().equals(calisanId)) {
                calisanList.get(i).maas += (calisanList.get(i).maas * calisanList.get(i).Departman.getZamOrani()) / 100;
            }
        }
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "calisanId='" + calisanId + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", maas=" + maas +
                ", Departman=" + getDepartmanAdi() +
                '}';
    }
}
