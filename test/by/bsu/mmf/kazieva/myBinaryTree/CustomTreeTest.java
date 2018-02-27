package by.bsu.mmf.kazieva.myBinaryTree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by YiaKrevetko on 31.01.2018.
 */
public class CustomTreeTest {
    @Test
    public void setTree() throws Exception {

    }

    @Test
    public void preOrderTraversal() throws Exception {
        String set="1 2 5 3 8";
        String[] a = set.split(" ");
        CustomTree<String> customTree = new CustomTree<>(a);
        customTree.preOrderTraversal();
    }

    @Test
    public void inOrderTraversal() throws Exception {
        String set="1 2 5 3 8";
        String[] a = set.split(" ");
        CustomTree<String> customTree = new CustomTree<>(a);
        customTree.inOrderTraversal();

    }

    @Test
    public void postOrderTraversal() throws Exception {
        String set="1 2 5 3 8";
        String[] a = set.split(" ");
        CustomTree<String> customTree = new CustomTree<>(a);
        customTree.postOrderTraversal();

    }

    @Test
    public void printTree() throws Exception {
        String set="1 2 5 3 8";
        String[] a = set.split(" ");
        CustomTree<String> customTree = new CustomTree<>(a);
        customTree.printTree();

    }

}