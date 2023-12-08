package lesson.lesson30.dryKissYagni;

import java.util.List;

public class DAta {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        double standardDeviation = Math.sqrt(variance / numbers.size());

        return standardDeviation;
    }

}

class Data1 {
    public double calculatorAvg(List<Double> numbers, boolean sqrt) {
        double avg = numbers.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        return sqrt ? Math.sqrt(avg) : avg;
    }
}
