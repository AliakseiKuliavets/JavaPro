package homeWork.algorit._17_10_23;

public class Main {
    public static void main(String[] args) {

    }
    private static int nElementRecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return nElementRecursion(n / 2) + nElementRecursion(n / 2 - 1);
        } else {
            return nElementRecursion(n / 2) - nElementRecursion(n / 2 - 1);
        }
    }
}
