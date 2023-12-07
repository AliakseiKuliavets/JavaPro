package lesson.lesson30.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Package> packageList1 = new ArrayList<>();
        List<Package> packageList2 = new ArrayList<>();

        packageList1.add(new Package("A", "C"));
        packageList1.add(new Package("A", "D"));

        packageList2.add(new Package("B", "C"));
        packageList2.add(new Package("B", "D"));

        Courier courier1 = new Courier("A", "C", packageList1);
        Courier courier2 = new Courier("B", "D", packageList2);

        courier1.setAnotherCourier(courier2);
        courier2.setAnotherCourier(courier1);

        new Thread(courier1).start();
        new Thread(courier2).start();
    }
}
