package homeWork.algorit._25_09_23;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        FactorialN factorialN = new FactorialN();
        System.out.println("Факториал чила " + n + " равен: " + factorialN.getSumFactorIal(n));
    }
    //a) O(n)
    //for (int i = 0; i < n; ++i) {
    //  for (int j = 1; j < m; ++j) {
    //    a[i][j]++;
    //  }
    //}

    //b)  O(n^2)
    //for (int i = 0; i < n-1; ++i) {
    //  for (int j = 0; j < n-i; ++j) {
    //    a[i][j]++;
    //  }
    //}

    //c)  O(n * log3(n))
    //for (int i = 0; i < n; ++i) {
    //  for (int j = 1; j < n; j *= 3) {
    //    a[i][j]++;
    //  }
    //}

    //d)  O(n)
    //for (int i = 0; i < 1000; ++i) {
    //  for (int j = 1; j < n; ++j) {
    //    ++count;
    //  }
    //}

    //e) O(n/3)
    //for (int i = 0; i < n; ++i) {
    //  for (int j = 0; j < n/3; ++j) {
    //    matrx[i][i]++;
    //  }
    //}
}
