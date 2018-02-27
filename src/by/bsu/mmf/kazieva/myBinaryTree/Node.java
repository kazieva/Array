package by.bsu.mmf.kazieva.myBinaryTree;
public class Node<T> {
    public T data;
    public Node leftNode;
    public Node rightNode;

    public Node(T data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }
}

