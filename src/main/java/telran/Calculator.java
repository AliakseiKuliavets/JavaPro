package telran;

public class Calculator {
    public boolean calculate(int x, int y) {
        if (x > y) return false;
        int z = y / x;
        return z <= 5;
    }
}
