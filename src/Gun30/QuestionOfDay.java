package Gun30;

public class QuestionOfDay {

    int a;
    static int b = 0;   // b sen bir tanesin 2 eded ola bilmezsin

    void increase() {

        a++;
        b++;

    }

    public static void main(String[] args) {

        QuestionOfDay questionOfDay1 = new QuestionOfDay();

        questionOfDay1.a = 5;

        QuestionOfDay questionOfDay2 = new QuestionOfDay();

        questionOfDay2.a = 7;

        // a nin deyeri necedir burada: hansi a nin deyeri deyilmeli
        // burada her obyektin a si var

        System.out.println("questionOfDay1.a = " + questionOfDay1.a); // 5
        System.out.println("questionOfDay2.a = " + questionOfDay2.a); // 7


        // b nin deyeri necedir
        System.out.println("QuestionOfDay.b = " + QuestionOfDay.b);

        questionOfDay1.increase();   //  a=5 +1  b= 0+1

        System.out.println("questionOfDay1.a = " + questionOfDay1.a);
        System.out.println("questionOfDay1.b = " + QuestionOfDay.b);

        questionOfDay2.increase();   //  a=7+1   b=1+1 (b=1 yuxaridan geldi)


        System.out.println("questionOfDay2.a = " + questionOfDay2.a);
        System.out.println("questionOfDay1.b = " + QuestionOfDay.b);
    }
}
