package by.bsu.mmf.kazieva.test;

import by.bsu.mmf.kazieva.Array;
import by.bsu.mmf.kazieva.ArrayList;
import org.junit.Test;

import static org.junit.Assert.*;

    public class ArrayListTest {
        @org.junit.Test
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

        @org.junit.Test
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

        @org.junit.Test
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

    }