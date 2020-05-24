import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void lengthLessMiddleToArr() {
        Counter counter = new Counter();
        ArrayList<String> arr = new ArrayList<String>(); arr.add("student"); arr.add("kpi"); arr.add("today");
        ArrayList<String> exp = new ArrayList<>(); exp.add("kpi"); exp.add("today");
        ArrayList<String> real = counter.LengthLessMiddleToArr(arr);
        assertEquals(exp, real);
    }

    @Test
    public void lengthMoreMiddleToArr() {
        Counter counter = new Counter();
        ArrayList<String> arr = new ArrayList<String>(); arr.add("student"); arr.add("kpi"); arr.add("today");
        ArrayList<String> exp = new ArrayList<>(); exp.add("student"); exp.add("today");
        ArrayList<String> real = counter.LengthMoreMiddleToArr(arr);
        assertEquals(exp, real);
    }

    @Test
    public void countMiddle() {
        Counter counter = new Counter();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("student"); arr.add("kpi"); arr.add("today");
        int real = counter.CountMiddle(arr);
        int exp = 5;
        assertEquals(exp,real);
    }
}