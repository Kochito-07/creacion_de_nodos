package Ejercicio_04_depth;

import Ejercicio_01_insert.Node;

public class Depth {
    
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
