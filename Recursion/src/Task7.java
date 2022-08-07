import java.util.List;

public class Task7 {
    public static int findSecondMax(List<Integer> list) {
        return findMax(list, list.size(), list.get(0), 0);
    }

    private static int findMax(List<Integer> list, int defaultSize, Integer max, int index) {
        if (index == list.size() && defaultSize != list.size()) return max;
        if (index == list.size()) {
            list.remove(max);
            return findMax(list, defaultSize, list.get(0), 0);
        }
        if (list.get(index) > max) {
            max = list.get(index);
        }
        return findMax(list, defaultSize, max, index + 1);
    }
}
