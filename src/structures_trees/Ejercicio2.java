package structures_trees;

import structures.Node;

public class Ejercicio2 {
    public Node<Integer> invert(Node<Integer> root) {
        if (root == null) {
            return null;
        }

        Node<Integer> temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invert(root.getLeft());
        invert(root.getRight());

        return root;

    }

    public void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el árbol:");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> root, int i) {
        if (root == null) {
            return;
        }
        printTreeRecursivo(root.getRight(), i + 1);
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        System.out.println(root.getData());
        printTreeRecursivo(root.getLeft(), i + 1);
    }    
}

