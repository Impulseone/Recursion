import java.util.List;

public class Task7 {
    public static int findSecondMax(List<Integer> list) {
        return find(list);
    }

    public static int find(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++)
            if (list.get(i) > list.get(i + 1)) {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                count++;
            }
        if (count > 0) {
            return find(list);
        }
        return list.get(list.size() - 2);
    }
}
