package structures_trees;

import structures.Node;

public class Ejercicio1 {
    public void printTree(Node<Integer> root) {
        System.out.println("Imprimiendo el árbol:");
        printTreeRecursivo (root, 0);
    }    
    private void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }
        printTreeRecursivo(actual.getRight(), nivel + 1);
        System.out.println(" ".repeat(nivel * 4) + actual.getData());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
}
