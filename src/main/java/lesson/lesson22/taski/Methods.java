package lesson.lesson22.taski;


public class Methods {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "aa##aa##";
        System.out.println(twoStringEquals(s1, s2));
    }

    public static String count(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder result = new StringBuilder();
        int backspaceCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                backspaceCount++;
            } else if (backspaceCount > 0) {
                backspaceCount--;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static boolean twoStringEquals(String s1, String s2) {
        return count(s1).equals(count(s2));
    }
}
