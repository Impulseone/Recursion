import java.util.Stack;

public class Task3 {
    public static int pop(Stack<String> stringsStack, int index) {
        if (stringsStack.empty()) return index;
        stringsStack.pop();
        return pop(stringsStack, index + 1);
    }
}
