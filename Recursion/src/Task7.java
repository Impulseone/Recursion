import java.util.List;

public class Task7 {
    public static int findSecondMax(List<Integer> list) {
        return findMax(list, 0, 0);
    }

    private static int findMax(List<Integer> list, int max, int index) {
        if (index == list.size()) return max;
        if (list.get(index) > max) {
            max = list.get(index);
        }
        return findMax(list, max, index + 1);
    }
}
