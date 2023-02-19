package Gun20;

public class _13_JavaMethodHomeAssignment7 {
    public static void main(String[] args) {

//   7    powerOfThree isminde bir method olusturun.
//           Parametre olarak int
//           Return tipi boolean
//           Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//                **Örnek 1:**
//                            **Girdi:** 27
//                                   **Çıktı:** true
//              Açıklama: 3*3*3 =27
//                                  Sonuç= true

         powerOfThree(125);

    }

    private static double powerOfThree(int number) {

        double numberCbrt = Math.cbrt(number);

        System.out.println(numberCbrt % 1 == 0);

        return numberCbrt;
    }

}
