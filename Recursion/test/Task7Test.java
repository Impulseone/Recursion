import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Task7Test {

    @Test
    public void findMax() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(4);
        int m = Task7.findSecondMax(list);
        assertEquals(5, m);
    }

    @Test
    public void findMax2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(3);
        int m = Task7.findSecondMax(list);
        assertEquals(5, m);
    }

    @Test
    public void findMax3() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        int m = Task7.findSecondMax(list);
        assertEquals(3, m);
    }

    @Test
    public void findMax4() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int m = Task7.findSecondMax(list);
        assertEquals(2, m);
    }

    @Test
    public void findMax5() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        int m = Task7.findSecondMax(list);
        assertEquals(2, m);
    }
}