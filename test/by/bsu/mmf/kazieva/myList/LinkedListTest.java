package by.bsu.mmf.kazieva.myList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void addFront() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.addFront(5);
        Object expect = 5;
        Object result = simple.get(0);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void addBack() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.addFront(2);
        simple.addBack(3);
        Object expect = 3;
        Object result = simple.get(simple.size()-1);
        Assert.assertEquals(expect, result);

    }

    @Test
    public void add() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.addBack(1);
        simple.addFront(2);
        simple.add(3);
        boolean expect = true;
        boolean result = simple.contains(3);
        Assert.assertEquals(expect, result);

    }

    @Test
    public void add1() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(5,1);
        Object expect = 5;
        Object result = simple.get(1);
        Assert.assertEquals(expect, result);
    }
    @Test
    public void get() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        Object expect =2;
        Object result = simple.get(1);
        Assert.assertEquals(expect, result);
    }
    @Test
    public void get1() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        Object expect =null;
        Object result = simple.get(10);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void contains() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        boolean expect =true;
        boolean result = simple.contains(1);
        Assert.assertEquals(expect, result);
    }

    @Test
    public void deleteElement() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.deleteElement(2);
        boolean result =simple.contains(2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void deleteElementByIndex() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        Object member = simple.get(1);
        simple.deleteElementByIndex(2);
        boolean result =simple.contains(member);
        Assert.assertEquals(false, result);
    }

    @Test
    public void size() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        int expect =3 ;
        int result = simple.size();
        Assert.assertEquals(expect, result);

    }

    @Test
    public void isEmpty() throws Exception {
        LinkedList<Object> simple = new LinkedList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        boolean expect =false;
        boolean result = simple.isEmpty();
        Assert.assertEquals(expect, result);

    }

}