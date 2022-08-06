import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Task7Test {

    @Test
    public void findMax() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(3);
        int m = Task7.findSecondMax(list);
        assertEquals(3, m);
    }

    @Test
    public void findMax2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(3);
        int m = Task7.findSecondMax(list);
        assertEquals(4, m);
    }

    @Test
    public void findMax3() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        int m = Task7.findSecondMax(list);
        assertEquals(3, m);
    }
}