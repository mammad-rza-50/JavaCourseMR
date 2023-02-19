package Gun31.QuestionOfDays;

public enum PizzaSize {

    Small(100),
    Medium(200),
    Large(300);


    int value;

    PizzaSize(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PizzaSize{" +
                "value=" + value +
                '}';
    }
}
