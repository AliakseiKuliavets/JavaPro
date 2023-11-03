package practice.some.Algoritms;

public class Average {
    public static void main(String[] args) {
        double[] array = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (double v : array) {
            result += v;
        }
        System.out.println(result / array.length);
    }
}
