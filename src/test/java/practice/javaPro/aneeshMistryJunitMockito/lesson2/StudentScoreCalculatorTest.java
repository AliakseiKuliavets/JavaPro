package practice.javaPro.aneeshMistryJunitMockito.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentScoreCalculatorTest {
    private  StudentScoreCalculator sc;
    @BeforeEach
    void setUp(){
         sc = new StudentScoreCalculator();
    }
    @Test
    public void studentScoreCalculatorRegularTest(){
        sc.calculateSATScore(50,50);
        Assertions.assertEquals(2500,sc.getSatScore());
    }
}