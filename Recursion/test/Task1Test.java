import static org.junit.Assert.assertEquals;

public class Task1Test {

    @org.junit.Test
    public void exponentiationTest() {
        int result = Task1.exponentiation(2,3);
        assertEquals(8, result);
    }
}