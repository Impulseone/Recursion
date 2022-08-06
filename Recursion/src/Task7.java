import java.util.List;

public class Task7 {
    public static int findSecondMax(List<Integer> list) {
        Integer max = findMax(list, list.get(0), 0);
        list.remove(max);
        return findMax(list, list.get(0), 0);
    }

    private static int findMax(List<Integer> list, int max, int index) {
        if (index == list.size()) return max;
        if (list.get(index) > max) {
            max = list.get(index);
        }
        return findMax(list, max, index + 1);
    }
}
