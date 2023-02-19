package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a = 14; int b =7;

        System.out.println("a-nin mutlaq deyeri= " + Math.abs(a));
        System.out.println("a ve b-nin boyuk olani = " + Math.max(a,b));
        System.out.println("a ve b-nin kicik olani = " + Math.min(a,b));
        System.out.println("2 nin 3 quvveti= " + Math.pow(2,3));
        System.out.println("b nin kokaltisi= " + Math.sqrt(b));
        System.out.println("round 3.1(yuvarlamaq) = " + Math.round(3.1));
        System.out.println("round 3.5(yuvarlamaq)= " + Math.round(3.5));
        System.out.println("ceil 3.1 " + Math.ceil(3.1));//reqemden boyuk en yaxin tam sayi yani burada 4
        System.out.println("ceil 3.5 " + Math.ceil(3.5));
        System.out.println("floor 3.1 " + Math.floor(3.1));//bu reqemden kicik en yaxin tam sayi
        System.out.println("floor 3.5 " + Math.floor(3.5));



    }
}
