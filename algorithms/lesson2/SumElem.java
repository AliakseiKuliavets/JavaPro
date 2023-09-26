package algorithms.lesson2;

public class SumElem {
    public static void main(String[] args) {
        System.out.println(sumElements(5));
    }
    private static int sumElements(int n) {
        int result = 0;
        if (n != 0) {
            System.out.println(n);
            result = sumElements(n-1);
        }
        return result;
    }
}
