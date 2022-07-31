import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void sumTest() {
        int result = Task2.sumOfDigit(123);
        assertEquals(6, result);
    }
}