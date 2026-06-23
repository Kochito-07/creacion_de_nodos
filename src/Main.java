import Ejercicio_01_insert.InsertBSTTest;
import Ejercicio_01_insert.Node;
import Ejercicio_02_invert.InvertBinaryTree;
import Ejercicio_03_listLeves.ListLevels;
import Ejercicio_04_depth.Depth;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("=== Ejercicio 01: Insertar en BST ===");
        InsertBSTTest insertTest = new InsertBSTTest();
        int[] numerosEj1 = {5, 3, 7, 2, 4, 6, 8};
        Node rootEj1 = insertTest.insert(numerosEj1);
        System.out.println("Imprimiendo el árbol:");
        imprimirArbolAcostado(rootEj1, 0);
        System.out.println("\n");

        System.out.println("=== Ejercicio 02: Invertir árbol binario ===");
        int[] numerosEj2 = {4, 2, 7, 1, 3, 6, 9};
        Node rootEj2 = insertTest.insert(numerosEj2);
        
        System.out.println("Árbol original:");
        System.out.println("Imprimiendo el árbol:");
        imprimirArbolAcostado(rootEj2, 0);
        System.out.println("\n");

        InvertBinaryTree invertTest = new InvertBinaryTree();
        Node invertedRoot = invertTest.invertTree(rootEj2);
        
        System.out.println("Árbol invertido:");
        System.out.println("Imprimiendo el árbol:");
        imprimirArbolAcostado(invertedRoot, 0);
        System.out.println("\n");

        rootEj2 = invertTest.invertTree(invertedRoot);

        System.out.println("=== Ejercicio 03: Listar niveles ===");
        ListLevels listLevelsTest = new ListLevels();
        List<List<Node>> niveles = listLevelsTest.listLevels(rootEj2);
        
        for (int i = 0; i < niveles.size(); i++) {
            for (int j = 0; j < niveles.get(i).size(); j++) {
                System.out.print(niveles.get(i).get(j).value);
                if (j < niveles.get(i).size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }

        System.out.println("\n=== Ejercicio 04: Profundidad máxima ===");
        Depth depthTest = new Depth();
        int maxDepth = depthTest.maxDepth(rootEj2);
        System.out.println("Resultado: " + maxDepth);
    }

    public static void imprimirArbolAcostado(Node root, int espacio) {
        int DISTANCIA = 5; 
        
        if (root == null) {
            return;
        }
        
        espacio += DISTANCIA;

        imprimirArbolAcostado(root.right, espacio);

        System.out.println();
        for (int i = DISTANCIA; i < espacio; i++) {
            System.out.print(" ");
        }
        System.out.print(root.value + "\n");

        imprimirArbolAcostado(root.left, espacio);
    }
}