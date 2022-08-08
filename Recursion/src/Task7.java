import java.util.List;

public class Task7 {
    public static int findSecondMax(List<Integer> list) {
        return findMax(list, list.get(0), null, 1);
    }

    private static int findMax(List<Integer> all, Integer max, Integer secondMax, int index) {
        if (index == all.size()) {
            return secondMax == null ? max : secondMax;
        }
        if (all.get(index).equals(max) && secondMax == null) {
            secondMax = all.get(index);
        }
        if (all.get(index) > max) {
            max = all.get(index);
            secondMax = null;
        }
        return findMax(all, max, secondMax, index + 1);
    }
}
