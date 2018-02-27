package by.bsu.mmf.kazieva.myList;
public interface Array<E>  extends Iterable<E>{
    void add(E e);
    void remove(E e);
    void removeAt(int index);
    E get (int index);
    int indexOf(E e);
    void insert(E e, int index);
    int size();
    void update(int index, E e);
    void printArrayList();
}
