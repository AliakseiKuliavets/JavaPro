package telran;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    private static Object[] testCalculateValues() {
        return new Object[] {
                new Object[]{10, 5, false},
                new Object[]{15, 2, false},
                new Object[]{2, 15, false},
                new Object[]{2, 5, true},
                new Object[]{4, 2, false},
        };
    }

    @Test
    @Parameters(method = "testCalculateValues")
    public void calculateTest(int x, int y, boolean expected) {
        Assertions.assertEquals(expected, calculator.calculate(x, y));
    }
}