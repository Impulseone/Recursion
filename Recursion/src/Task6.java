import java.util.List;

public class Task6 {
    public static void printOnlyEvenIndexValues(List<Integer> list, int index) {
        if (index == list.size()) return;
        if (index % 2 == 0) {
            System.out.println(list.get(index));
        }
        printOnlyEvenIndexValues(list, index + 1);
    }
}
