package homeWork.algorit._25_09_23;

public class FactorialN {
    private int sumFactor = 1;

    private int factorialN(int n) {
        if (n != 0) {
            sumFactor = n * (sumFactor * factorialN(n - 1));
        }
        return sumFactor;
    }

    public int getSumFactorIal(int n) {
        return factorialN(n);
    }
}
