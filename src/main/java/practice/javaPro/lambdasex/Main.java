package practice.javaPro.lambdasex;

public class Main {
    public static void main(String[] args) {
        StringEx revers = (m) -> {
            StringBuilder result = new StringBuilder();
            for (int i = m.length() - 1; i >= 0; i--) {
                result.append(m.charAt(i));
            }
            return result.toString();
        };
        String s = "nana";
        System.out.println((revers.func(s).equals(s)) ? "Это палиндром: " + s : "Это не палиндром: " + s);
    }
}
