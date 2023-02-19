package PROJE_04.Veritabani;

import PROJE_04.Modeller.Calisanlar.Calisan;
import PROJE_04.Modeller.Departmanlar.Departman;

import java.util.ArrayList;

public class Calisanlar {


    // Buradaki calisanList static cünkü proje calismaya basladiği anda oluşması lazım. Bunu bir veritabani
    // gibi görebiliriz. Calisanlarimizin hepsi bu liste icerisinde yer alacak.
    private static ArrayList<Calisan> calisanList = new ArrayList<>();

    // Calisanlari almak icin basit bir getter method
    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }

    // Bir çalışan eklemek için gerekli method.
    public static void addACalisan(Calisan calisan) {
        Calisanlar.calisanList.add(calisan);

    }

    // Bir çalışan silmek için gerekli method.
    public static void deleteACalisanWithId(String calisanId) {
        for (int i = 0; i < calisanList.size(); i++) {
            if (calisanList.get(i).getCalisanId().equals(calisanId)) {
                calisanList.remove(calisanList.get(i));
            }
        }
    }

    // Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        Departman deprtmn = null;
        for (Departman dprman : Departmanlar.getDepartmanList()) {
            if (dprman.getDepartmanKodu().equals(departmanKodu)) {
                deprtmn = dprman;
            }
        }
        for (Calisan calisan : calisanList) {
            if (calisan.getDepartman() == deprtmn) {
                System.out.println(calisan);
            }
        }
    }

    // Calisanlari konsola yazdirmak için
    public static void printCalisanlar() {

        for (Calisan calisan : calisanList) {

            System.out.println(calisan.toString());
        }
    }
}
