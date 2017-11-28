package by.bsu.mmf.kazieva;

public class Runner {
    public static void main(String[] args) {
        Array<Integer> simple = new ArrayList<>();
        simple.add(1);
        simple.add(2);
        simple.add(3);
        simple.add(4);
        simple.add(5);
        simple.insert( 10,3);
        simple.printArrayList();
        simple.remove(10);
        simple.remove(55);
        simple.removeAt(2);
        simple.printArrayList();
    }

}
