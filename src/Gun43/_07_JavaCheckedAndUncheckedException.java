package Gun43;

public class _07_JavaCheckedAndUncheckedException {
    public static void main(String[] args) {

        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.


        String str = "";

        char firstLetter = str.charAt(0);
        // sen bilirsen ister try-catch, ister istifade etme
        // Unchecked Exception

        try {

            Thread.sleep(1000);// try-catch mecbur: Checked Exception
        } catch (InterruptedException error) {

            System.out.println("Xeta oldu");
        }
    }
}
