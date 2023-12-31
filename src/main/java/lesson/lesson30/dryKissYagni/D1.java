package lesson.lesson30.dryKissYagni;

import java.util.List;

public class D1 {

    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        double sumOfAllValues = 0;
        for (double currentValue : listOfNumbers) {
            sumOfAllValues += currentValue;
        }
        return sumOfAllValues / listOfNumbers.size();
    }
}

class D2 {
    public double calculateAvgList(List<Double> listOfNumbers) {
        if (listOfNumbers == null || listOfNumbers.isEmpty()) {
            throw new IllegalArgumentException("Лист не может быть пус или быть равен NULL");
        }
        return listOfNumbers.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}