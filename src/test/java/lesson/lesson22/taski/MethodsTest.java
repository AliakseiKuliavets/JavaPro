package lesson.lesson22.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MethodsTest {

    @ParameterizedTest
    @CsvSource(value = {
            "aaa,aaa",
            "a#aa,aa",
            "a#a#a,a",
            "aa#a#a,aa",
    })
    void countTest(String s, String expected) {
        assertEquals(expected, Methods.count(s));
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
        assertEquals(expected,Methods.twoStringEquals(sLat1,sLat2));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Methods.toCamelCase(input));
    }
    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", Methods.toCamelCase(input));
    }

    @Test
    public void Test1() {
        assertEquals( 7, Methods.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( 6, Methods.digital_root(456));
    }

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                Methods.encode("Prespecialized"));
        assertEquals("))))())))",Methods.encode("   ()(   "));
    }
    @Test
    public void test1() {
        assertThat(Methods.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(Methods.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat(Methods.order(""), equalTo(""));
    }
    @Test
    public void shouldConvertToRoman() {
        assertEquals("I", Methods.solution(1));
        assertEquals( "IV", Methods.solution(4));
        assertEquals( "VI", Methods.solution(6));
    }
}