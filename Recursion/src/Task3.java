import java.util.EmptyStackException;
import java.util.Stack;

public class Task3 {
    public static int pop(Stack<String> stringsStack, int index) {
        try {
            stringsStack.pop();
            return pop(stringsStack, index + 1);
        } catch (EmptyStackException e) {
            return index;
        }
    }
}
