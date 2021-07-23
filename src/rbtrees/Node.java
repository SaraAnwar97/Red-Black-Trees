package rbtrees;
public class Node {
     private final int RED = 0;
    private final int BLACK = 1;
    String key = "";
            int color = BLACK;
        Node left = RBTrees.nil, right = RBTrees.nil, parent = RBTrees.nil;

        Node(String key) {
            this.key = key;
        } 
}
