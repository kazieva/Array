package by.bsu.mmf.kazieva;

import java.util.Iterator;

public class ArrayList<E> implements Array<E>{
    public final static int NO_ELEMENT = -100;
    private E[] values;

    public ArrayList() {
        values= (E[]) new Object[0];
    }

    @Override
    public void add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void remove(E e) {
       int index = indexOf(e);
       if(index>=0){
           removeAt(index);
       }
    }

    @Override
    public void removeAt(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementAfterIndex=temp.length- index;
            System.arraycopy(
                    temp, index + 1,
                    values, index,
                    amountElementAfterIndex-1 );
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int indexOf(E e) {
        for (int i=0; i<values.length;i++){
            if(values[i].equals(e)) {
                return i;
            }
        }
        return NO_ELEMENT;
    }

    @Override
    public void insert(E e, int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementAfterIndex=temp.length- index;
            values[index]=e;
            System.arraycopy(
                    temp, index,
                    values, index+1,
                    amountElementAfterIndex );
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index]=e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
    public void printArrayList(){
        System.out.println("Array : ");
        for (E element : values){
            System.out.println(element);
        }
    }
}
