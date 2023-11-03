package lesson.lesson15.practice;

public class GE3 {
    Show<String , Integer> stringIntegerShow = new Show<>("Some",123);

}
class Show<V1,V2> {
    private V1 value1;
    private V2 value2;

    public Show(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Show{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
