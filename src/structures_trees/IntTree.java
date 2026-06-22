package structures_trees;

import structures.Node;

// Clase que representa un árbol binario de enteros
public class IntTree {
    private Node<Integer> root;

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node<Integer> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderRec(node.getLeft());
            preOrderRec(node.getRight());
        }
    }

    public void posOrder() {
        posOrderRec(root);
    }

    private void posOrderRec(Node<Integer> node) {
        if (node != null) {
            posOrderRec(node.getLeft());
            posOrderRec(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }

    public void insert(int i) {
        root = insertRec(root, i);
    }

    private Node<Integer> insertRec(Node<Integer> node, int i) {
        if (node == null) {
            return new Node<>(i);
        }

        if (i < node.getData()) {
            node.setLeft(insertRec(node.getLeft(), i));
        } else {
            node.setRight(insertRec(node.getRight(), i));
        }

        return node;
    }

    public Node<Integer> getRoot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoot'");
    }

}