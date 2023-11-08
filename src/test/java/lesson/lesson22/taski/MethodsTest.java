package lesson.lesson22.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class MethodsTest {

    @ParameterizedTest
    @CsvSource(value = {
            "aaa,aaa",
            "a#aa,aa",
            "a#a#a,a",
            "aa#a#a,aa",
    })
    void countTest(String s, String expected) {
        Assertions.assertEquals(expected, Methods.count(s));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "aaa,aaa###aaa, true",
            "aaa,a#aa,false"
    })
    @Test
    void twoStringEqualsTest(String s1,String s2, boolean expected) {
        String sLat1 = Methods.count(s1);
        String sLat2 = Methods.count(s2);
        Assertions.assertEquals(expected,Methods.twoStringEquals(sLat1,sLat2));
    }
}