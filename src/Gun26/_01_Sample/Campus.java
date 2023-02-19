package Gun26._01_Sample;

public class Campus {
    public static void main(String[] args) {

        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)  -> tip
        // Ogrenci : okulNo, tamAd, okulu  -> Tip

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz
        // atayıp  yazdırınız.

        Student stdnt = new Student();

        stdnt.schoolNo = 1;
        stdnt.fullName = "Memmed Rzayev";

        // first way

        stdnt.schools = new School();
        stdnt.schools.name = "AzSOAcd";
        stdnt.schools.directorName = "Nureddin Rzayev";
        stdnt.schools.fee = 12000;

        System.out.println("stdnt = " + stdnt.schools.name); // 2 way
        System.out.println("stdnt = " + stdnt.schools.directorName);
        System.out.println("stdnt = " + stdnt.schools.fee);

        // second way

        School schl = new School();
        schl.name = "AzSOAcd";
        schl.directorName = "Nureddin Rzayev";
        schl.fee = 12000;
        stdnt.schools = schl;

        System.out.println("schl = " + schl.name);
        System.out.println("schl.directorName = " + schl.directorName);
        System.out.println("schl.fee = " + schl.fee);


    }
}
