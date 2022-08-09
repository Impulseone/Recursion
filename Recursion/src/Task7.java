import java.util.List;

public class Task7 {
    public static int findSecondMax(List<Integer> list) {
        return findMax(list, list.get(0), null, 1);
    }

    private static int findMax(List<Integer> all, Integer max, Integer secondMax, int index) {
        if (index == all.size()) {
            return secondMax == null ? max : secondMax;
        }
        Integer currentElement = all.get(index);
        if (currentElement.equals(max) && secondMax == null) {
            secondMax = currentElement;
        }
        if (currentElement > max) {
            max = currentElement;
            secondMax = null;
        }
        return findMax(all, max, secondMax, index + 1);
    }
}
