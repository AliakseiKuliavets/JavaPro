package lesson.lesson25;


public class MT3 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("TH1: " + i + " -----------------------------");
            }
        }).start();
    }
}
