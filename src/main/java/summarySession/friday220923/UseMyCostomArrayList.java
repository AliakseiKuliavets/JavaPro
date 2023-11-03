package summarySession.friday220923;

public class UseMyCostomArrayList {
    public static void main(String[] args) {
        MyCustomArrayList list = new MyCustomArrayList(new String[] {"One", "Two", "Three"});

        for (String data : list) {
            System.out.println(data);
        }
    }
}
