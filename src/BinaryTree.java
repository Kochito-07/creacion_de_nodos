import java.util.Random;

import structures.Node;

public class BinaryTree<T extends Comparable<T>> {
    public class IntTree {

    private Node<T> root;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return (Node<T>) root;
    }

    public void setRoot(Node<T> node) {
        root = (Node<T>) node;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        root = (Node<T>) node;
    }

    public void insert(T value) { // 10
        Node<T> node = new Node<T>(value);
        root = (Node<T>) insertRecursivo(root, node);
    }

    public void insert(Node<T> value) { // 10
        root = (Node<T>) insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayoy o nenor y decidir si lo ingerso a la der o izq
        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar))
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return (Node<T>) actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<T> root2) {
        if (root2 == null)
            return;
        System.out.print(root2 + " ");
        preOrderRecursivo(root2.getLeft());
        preOrderRecursivo(root2.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<T> root2) {
        if (root2 == null)
            return;
        posOrderRecursivo(root2.getLeft());
        posOrderRecursivo(root2.getRight());
        System.out.print(root2 + " ");

    }


    // inorder
    public void inOrder() {
        //inOrderRecursivo(root);
    }
    // niveles
    // altura    
    public int height() {
        return heightRecursivo(root);
    }

    private int heightRecursivo(Node<T> root2) {
        if (root2 == null) {
            return 0;
        }
        int leftHeight = heightRecursivo(root2.getLeft());
        int rightHeight = heightRecursivo(root2.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int peso() {
        return pesoRecursivo(root);
    } 
    private int pesoRecursivo(Node<T> root2) {
        if (root2 == null)
            return 0;
        int leftHeight = heightRecursivo(root2.getLeft());
        int rightHeight = heightRecursivo(root2.getRight());
        return leftHeight + rightHeight + 1;
    }

    private static void runIntComparativaPesos() {
        IntTree tree = new IntTree();
        Random random = new Random();

        final int TOTAL_NODOS = 50_000;
        final int MIN = 1;
        final int MAX = 50_000;

        // Insertar 50 000 números aleatorios entre 1 y 50 000
        for (int i = 0; i < TOTAL_NODOS; i++) {
            int value = random.nextInt(MAX - MIN + 1) + MIN;
            tree.insert(value);
        }

        // Medir peso con variable acumulada
        long inicioPesoVariable = System.nanoTime();

        int pesoVariable = tree.peso();

        long finPesoVariable = System.nanoTime();

        double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) / 1_000_000.0;

        // Medir peso recursivo
        long inicioPesoRecursivo = System.nanoTime();

        int pesoRecursivo = tree.peso();

        long finPesoRecursivo = System.nanoTime();

        double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) / 1_000_000.0;

        // Resultados
        System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
        System.out.println("Peso usando variable: " + pesoVariable);
        System.out.println("Peso usando recursion: " + pesoRecursivo);

        System.out.println();

        System.out.println("Tiempo getPeso(): "
                + tiempoPesoVariableMs + " ms");

        System.out.println("Tiempo pesoRecursivo(): "
                + tiempoPesoRecursivoMs + " ms");
    }

    //public int heightBFS() {
        //if (root == null) {
            //return 0;
        }
    //} 
//}
}
