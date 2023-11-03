package summarySession.friday031123;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginAndPasswordCheckerTest {
    private static LoginAndPasswordChecker checker;

    @BeforeAll
    public static void init(){
        checker = new LoginAndPasswordChecker();
    }
    @Test
    void checkLogin() {
        assertTrue(checker.checkLoginAndPassword("john","qwe123__","qwe123__"));
        assertTrue(checker.checkLoginAndPassword("johnRT123_","123","123"));
        assertTrue(checker.checkLoginAndPassword("123","123","123"));
        assertTrue(checker.checkLoginAndPassword("____","qwe123__","qwe123__"));
        assertFalse(checker.checkLoginAndPassword("","qwe123__","qwe123__"));
        assertFalse(checker.checkLoginAndPassword("*","qwe123__","qwe123__"));
        assertFalse(checker.checkLoginAndPassword("11111111111111111111","qwe123__","qwe123__"));

        assertThrows(NullPointerException.class, () -> checker.checkLoginAndPassword(null,"123","123"));
    }
    @Test
    void checkPassword(){
        assertTrue(checker.checkLoginAndPassword("john","qwe","qwe"));
        assertTrue(checker.checkLoginAndPassword("john","123","123"));
        assertTrue(checker.checkLoginAndPassword("john","___","___"));
        assertTrue(checker.checkLoginAndPassword("john","QwE123___","QwE123___"));
        assertFalse(checker.checkLoginAndPassword("john","___","123"));

        assertThrows(NullPointerException.class, () -> checker.checkLoginAndPassword("john",null,"123"));
        assertThrows(NullPointerException.class, () -> checker.checkLoginAndPassword("john","123",null));
    }
}