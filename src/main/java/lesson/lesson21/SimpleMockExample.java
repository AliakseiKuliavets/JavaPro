package lesson.lesson21;

public class SimpleMockExample {
    public  int sum(int a, int b) {
        return a + b;
    }
    public int mult(int a, int b){
        return a * b;
    }

    public String calculate(int a){
        int result = mult(10,10) + sum(10,10);
        return "" + result * a;
    }
}
