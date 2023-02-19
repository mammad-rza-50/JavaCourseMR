package Gun04;

public class _06_Sample2 {
    public static void main(String[] args) {

        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız  kg / (boy*boy)


        int agirlig = 85;
        double boy = 1.75;
        double index = (agirlig / (boy * boy));

        System.out.println("agirlig = " + agirlig+" kq");
        System.out.println("boy = " + boy+" mt");
        System.out.println("index = " + index);
        System.out.println("Memmedin agirligi= " + agirlig + " kq\nBoyu= " + boy + " mt\nKutle indexi= " + index);

    }
}
