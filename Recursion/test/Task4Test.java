import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void isPalindrom() {
        boolean result = Task4.isPalindrom("dfbrte");
        assertFalse(result);
    }

    @Test
    public void isPalindrom2() {
        boolean result = Task4.isPalindrom("abba");
        assertTrue(result);
    }

    @Test
    public void isPalindrom4() {
        boolean result = Task4.isPalindrom("tenet");
        assertTrue(result);
    }

    @Test
    public void isPalindrom3() {
        boolean result = Task4.isPalindrom("abbada");
        assertFalse(result);
    }
}