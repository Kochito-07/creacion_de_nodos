import structures.Node;
import structures_trees.Ejercicio1;
import structures_trees.Ejercicio2;
import structures_trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runEjercicio1();
        runEjercicio2();
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CLICLOS
        // node5.setLeft(root);

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        System.out.println("pre Order");
        arbolNumeros.preOrder();
        System.out.println("Pos Order");
        arbolNumeros.posOrder();
    }

    public static void runEjercicio1() {

        Ejercicio1 ejercicio1 = new Ejercicio1();
        Node<Integer> root = new Node<>(5);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node8 = new Node<>(8);
        root.setLeft(node3);
        root.setRight(node7);
        node3.setLeft(node2);
        node3.setRight(node4);
        node7.setLeft(node6);
        node7.setRight(node8);  
        ejercicio1.printTree(root);
    }

    public static void runEjercicio2() {
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Node<Integer> root = new Node<>(4);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node9 = new Node<>(9);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node1 = new Node<>(1);
        root.setLeft(node7);
        root.setRight(node9);
        node3.setLeft(node6);
        node3.setRight(node2);
        node7.setLeft(node3);
        node7.setRight(node1);  
        
        System.out.println("Árbol original:");
        ejercicio2.printTree(root);

        ejercicio2.invert(root);

        System.out.println("Árbol invertido:");
        ejercicio2.printTree(root);
    }
}

    