package Ejercicio_01_insert;

public class InsertBSTTest {
    
    public Node insert(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return null;
        }
        
        Node root = null;
        for (int num : numeros) {
            root = insertRec(root, num);
        }
        return root;
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        
        return root;
    }

    public void printTree(Node<Integer> root) {
        if (root == null) {
            return;
        }
        
        printTree(root.left);
        System.out.print(root.value + " ");
        printTree(root.right);
    }
}
