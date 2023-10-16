package lesson.lesson15.practice;

public class Calculator<T extends Number> {
    private T value;

    public Calculator(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public double add(Calculator<? extends  Number> other){
        return  this.value.doubleValue() + other.value.doubleValue();
    }

}
