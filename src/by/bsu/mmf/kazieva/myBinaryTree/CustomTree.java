package by.bsu.mmf.kazieva.myBinaryTree;
import static java.lang.Math.toIntExact;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class CustomTree<T> {
    private static final Logger LOGGER = Logger.getLogger(CustomTree.class.getName());
    private T[] treeArr;
    private Node root;
    private Integer rootIndex =0;
    private Long amountLevels;


    private Integer getLeftBranch(Integer index) {
        return index*2 +1 < treeArr.length ? index*2 +1 : null;
    }

    private Integer getRightBranch(Integer index) {
        return index*2 +2 < treeArr.length ? index*2 +2 : null;
    }

    private T getData(Integer index){
        return treeArr[index];
    }

    public void setTree(Node node,int index) {
        if (2*index + 1 < treeArr.length) {
            node.leftNode = new Node(treeArr[index*2 +1]);
            setTree(node.leftNode,index*2+1);
            if (2*index + 2 < treeArr.length) {
                node.rightNode = new Node(treeArr[2*index+2]);
                setTree(node.rightNode,index*2+2);
            }else {
                return;
            }
        }else {
            return;
        }
    }

    private boolean isEmptyOrNull(Integer index) {
        if (index==null || index >= treeArr.length)
            return true;
        return false;
    }

    public void preOrderTraversal() {
        LOGGER.info("preOrder");
        LOGGER.info(preOrderTraversalSubFun(rootIndex));
    }

    private String preOrderTraversalSubFun(Integer index) {
        if (isEmptyOrNull(index)) return "";
        return getData(index) + " " + preOrderTraversalSubFun(getLeftBranch(index)) + " " + preOrderTraversalSubFun(getRightBranch(index));
    }


    public void inOrderTraversal() {
        LOGGER.info("inOrder");
        LOGGER.info(inOrderTraversalSubFun(rootIndex));
    }

    private String inOrderTraversalSubFun(Integer index) {
        if (isEmptyOrNull(index)) return "";
        return  inOrderTraversalSubFun(getLeftBranch(index)) + " " +getData(index) +  " " + inOrderTraversalSubFun(getRightBranch(index));
    }

    public void postOrderTraversal() {
        LOGGER.info("postOrder");
        LOGGER.info(postOrderTraversalSubFun(rootIndex));
    }

    private String postOrderTraversalSubFun(Integer index) {
        if (isEmptyOrNull(index)) return "";
        return  postOrderTraversalSubFun(getLeftBranch(index))+  " " + postOrderTraversalSubFun(getRightBranch(index))  + " " +getData(index) ;
    }

    public CustomTree(final T[] tmpArr) {
        treeArr = tmpArr.clone();
        amountLevels =  Math.round( Math.log(treeArr.length+1)/Math.log(2)+1e-10)+1;

    }

    public void printTree() {
        LOGGER.info( "Print tree");
        int levelWidth = 2*treeArr.length;
        int widthForEachElement;
        double amountOfElementsAtLevel;
        int oldWidthForEachElement=levelWidth;
        for (int i = 0; i < amountLevels; i++) {
            amountOfElementsAtLevel = Math.pow(2,i);
            widthForEachElement = toIntExact(Math.round(levelWidth / amountOfElementsAtLevel));
            String format;
            Long currElement =  Math.round(Math.pow(2, i ) - 1);

            for (int j = 0; j < amountOfElementsAtLevel; j++) {
                if (currElement >= treeArr.length ) {
                    System.out.println();
                    return;
                }
                format = "%"  + oldWidthForEachElement +"s";
                if (j==0 && i!=0) {
                        format = "%"  +( oldWidthForEachElement/2)+"s";
                    }
                System.out.printf(format, treeArr[toIntExact(currElement)]);

                currElement++;
            }
            oldWidthForEachElement =widthForEachElement;
            System.out.println();

        }

    }

}
