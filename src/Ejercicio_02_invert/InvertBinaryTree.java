package Ejercicio_02_invert;

import Ejercicio_01_insert.Node;

public class InvertBinaryTree {
    
    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        
        // Intercambio de nodos
        Node temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        
        return root;
    }
}
