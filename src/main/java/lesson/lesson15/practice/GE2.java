package lesson.lesson15.practice;

public class GE2 {
    public static void main(String[] args) {
        Information<String> information = new Information<>("Some Text");
        System.out.println(information);
        String str = information.getValue();
        System.out.println(str);
        System.out.println("-------------------------------------------------------");
        Information<Integer> integerInformation = new Information<>(123);
        System.out.println(integerInformation);
        int n = integerInformation.getValue();
        System.out.println(n);
    }
}
class Information<T> {
    private T value;

    public Information(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Information{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
