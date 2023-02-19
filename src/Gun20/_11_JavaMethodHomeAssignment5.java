package Gun20;

public class _11_JavaMethodHomeAssignment5 {
    public static void main(String[] args) {

//      5  EvenOddNums isminde bir method oluşturun.
//        Bu yöntem String olan bir parametreyi kabul etsin.
//        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//                toplam sonucu yazdırın.
//    **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//        For example Örnek:
//        String =  "6678421312"
//        6+6-7+8+4+2-1-3-1+2
//        sonuç 16 olmalı

        EvenOddNums("712142548");

    }

    public static int EvenOddNums(String numbers) {
        int numbersInt = Integer.parseInt(numbers);
        int total = 0;
        int count = 0;
        int remainder = 0;
        while (numbersInt > 0) {
            remainder = numbersInt % 10;
            numbersInt /= 10;
            count++;
            if (remainder % 2 == 0)
                total += remainder;
            else
                total -= remainder;
        }
        System.out.println("Step's Total = " + total);
        return total;
    }


}






