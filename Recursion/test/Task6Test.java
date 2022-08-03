import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void printOnlyEvenIndexValues() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(333);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Task6.printOnlyEvenIndexValues(list, 0);
    }
}