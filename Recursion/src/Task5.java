import java.util.List;

public class Task5 {
    public static void printOnlyEvenValues(List<Integer> list, int index) {
        if (index == list.size()) return;
        if (list.get(index) % 2 == 0) {
            System.out.println(list.get(index));
        }
        printOnlyEvenValues(list, index + 1);
    }
}
