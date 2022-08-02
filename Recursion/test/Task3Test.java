import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void pop() {
        Stack<String> stack = new Stack<>();
        int result = Task3.pop(stack, 0);
        assertEquals(0, result);
        stack.push("asd");
        stack.push("asd");
        stack.push("asd");
        stack.push("asd");
        int result2 = Task3.pop(stack, 0);
        assertEquals(4, result2);
    }
}