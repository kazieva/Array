package by.bsu.mmf.kazieva.myList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayListTest {

    public final static int NO_ELEMENT = -100;
    @Test
    public void add() throws Exception {
        Array<Object> simple = new ArrayList<>();
        simple.add(1);
        Assert.assertEquals(1,simple.size());
    }

    @Test
    public void remove() throws Exception {
        Array<Object> simpleRemove = new ArrayList<>();
        simpleRemove.add(1);
        simpleRemove.add(2);
        simpleRemove.add(3);
        simpleRemove.add(4);
        simpleRemove.add(5);
        simpleRemove.remove(4);
        int indexOfElement=simpleRemove.indexOf(4);
        assertEquals(NO_ELEMENT,indexOfElement);
    }

    @Test
    public void removeAt() throws Exception {
        Array<Object> simpleRemove = new ArrayList<>();
        simpleRemove.add(1);
        simpleRemove.add(2);
        simpleRemove.add(3);
        simpleRemove.add(4);
        simpleRemove.add(5);
        simpleRemove.removeAt(3);
        int indexOfElement=simpleRemove.indexOf(4);
        assertEquals(NO_ELEMENT,indexOfElement);
    }

    @Test
    public void get() throws Exception {
        Array<Object> simple = new ArrayList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(4);
        simple.add(5);
        Object result = simple.get(2);
        assertEquals(3,result);

    }

    @Test
    public void indexOf() throws Exception {
        Array<Object> simple = new ArrayList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(4);
        simple.add(5);
        Object result = simple.indexOf(5);
        assertEquals(4,result);

    }

    @Test
    public void insert() throws Exception {
        Array<Object> simple = new ArrayList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(4);
        simple.add(5);
        simple.insert(2,2);
        Assert.assertEquals(2,simple.get(2));
    }

    @Test
    public void size() throws Exception {
        Array<Object> simple = new ArrayList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(4);
        simple.add(5);
        Object result = simple.size();
        assertEquals(5,result);
    }

    @Test
    public void update() throws Exception {
        Array<Object> simple = new ArrayList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(4);
        simple.add(6);
        simple.insert(2,2);
        Assert.assertEquals(2,simple.get(2));
    }


}