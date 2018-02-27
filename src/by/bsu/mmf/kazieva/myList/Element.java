package by.bsu.mmf.kazieva.myList;

class Element<E> {
    E data;
    Element next;
    Element(){
    }
    Element(E value){
    E data=value;
    }

    public Element(Element next, E data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Element<?> element = (Element<?>) o;

        if (!data.equals(element.data)) return false;
        return next != null ? next.equals(element.next) : element.next == null;
    }

    @Override
    public int hashCode() {
        int result = data.hashCode();
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}