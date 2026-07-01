import java.util.Map;
import java.util.Set;

import Ejercicio_01_insert.Node;
import collections.sets.Sets;
import collections.sets.maps.Maps;
import models.Contacto;
import structures.graphs.Graph;
import structures_trees.IntTree;


public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        //runSets();
        //runMaps();
        runGraph();
    }

    private static void runMaps() {
        Maps maps = new Maps();
        Map<String, Integer> hashMap = maps.construirHashMap();
        maps.construirHashMap();
    }

    private static void runSets() {
        Sets sets = new Sets();

        System.out.println("HashSet: " + sets.construirHashSet());
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Tamaño: " + hashSet.size());
        System.out.println(hashSet.contains("F"));

        System.out.println("LinkedHashSet: " + sets.construirLinkedHashSet());
        Set<String> lhSet = sets.construirLinkedHashSet();
        System.out.println(lhSet);
        System.out.println("Tamaño: " + lhSet.size());
        System.out.println(lhSet.contains("A"));

        System.out.println("TreeSet: " + sets.construirTreeSet());
        Set<String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println("Tamaño: " + treeSet.size());
        System.out.println(treeSet.contains("A"));

        System.out.println("TreeSet con comparador: " + sets.construirTreeSetConComparador());
        Set<Contacto> treeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println(treeSetConComparador);
        System.out.println("Tamaño: " + treeSetConComparador.size());

        System.out.println("HashSet con Contactos: " + sets.construirHashSetContacto());
        Set<Contacto> hashSetConContacto = sets.construirHashSetContacto();
        System.out.println(hashSetConContacto);
        System.out.println("Tamaño: " + hashSetConContacto.size());
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
    private static void runGraph() {
        Graph<String> graph = new Graph<>();
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("J");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "A");
        graph.addEdge("D", "C");
        graph.addEdge("J", "D");
        graph.addEdge("D", "J");
        graph.addEdge("C", "D");

        System.out.println("Graph:");
        graph.printGraph();
    }
}

