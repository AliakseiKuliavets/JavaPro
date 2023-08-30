package lesson.lesson2;

public class Ex1 {
    int age;

    @Override
    public String toString() {
        return "Ex1{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Ex1());
    }
}
