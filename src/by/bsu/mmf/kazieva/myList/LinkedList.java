package by.bsu.mmf.kazieva.myList;

import java.util.Collection;
import java.util.ListIterator;

class LinkedList<E> {
    private Element head;
    private Element tail;
    private int size=0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public LinkedList(Collection collection){
        for (Object object : collection) {
            add(object);
        }
    }

    void addFront(E data) {
        Element a = new Element();
        a.data = data;

        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
        size++;
    }

    void addBack(E data) {
        Element a = new Element();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
        size++;
    }
    void add(Object data) {
        Element a = new Element();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
        size++;
    }

    public void add(E value, int k) {
        Element node = new Element();
        node.data = value;
        Element tmp = head;
        int i = 1;
        while (i < k) {
            tmp = tmp.next;
            i++;
        }
        node.next = tmp.next;
        tmp.next = node;
        size++;
    }
    public Object set(int k, Object o) {
        if(k>=0&&k<size) {
            Element temp = getElement(k);
            Object object = temp.data;
            temp.data = o;
            return object;
        } else {
            return null;
        }
    }
    public Element getElement(int k) {
        if (k<0||k>size)
            return null;
        Element element = head;
        int i = 0;
        while (i < k) {
            if (element.next!=null){
                element = element.next;
                i++;
            }
        }
        return element;
    }
    public Object get(int k) {
        Element element = getElement(k);
        if(element!=null){
            return element.data;}
        else return null;

    }

    void printList() {
        Element t = head;
        System.out.println("Linked list:");
        System.out.println(t.data.toString());
        while (t.next != null) {
            System.out.println(t.next.data.toString());
            t = t.next;
        }
        System.out.println(" ");
    }
    public boolean contains(E data) {
        if (tail==head){
            return (head.data.equals(data));
        }
        Element element = head;
        while (element.next != null) {
            if (element.data.equals(data)) {
                return true;
            }
            element = element.next;
        }
        if(tail.data.equals(data)){
            return true;
        }
        return false;
    }

    public void deleteElement(E data) {
        if (head == null)
            return;

        Element t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                size--;
                return;
            }
            t = t.next;
        }
    }
    public void deleteElementByIndex(int k) {
        if (k<0||k>size)
            return;

        Element prev = head;
        int i = 1;
        while (i < k) {
            if (prev.next!=null){
                prev = prev.next;
                i++;
            }
        }
        prev.next=prev.next.next;
        size--;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (head==null);
    }

    public ListIterator listIterator(int i) {
        return new ListIterator() {
            private int count = i;

            @Override
            public boolean hasNext() {
                return (count < size);
            }
            @Override
            public Object next() {
                Object temp = get(count++);
                return temp;
            }
            @Override
            public boolean hasPrevious() {
                return(count > 0);
            }

            @Override
            public Object previous() {
                Object temp = get(--count);
                return temp;
            }

            @Override
            public int nextIndex() {
                return count;
            }

            @Override
            public int previousIndex() {
                return count - 1;
            }

            @Override
            public void remove() {
                LinkedList.this.deleteElementByIndex(count);
            }

            @Override
            public void set(Object o) {
                LinkedList.this.set(count,o);
            }

            @Override
            public void add(Object o) {
                add(o);
            }
        };
    }
}
