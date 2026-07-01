package structures.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import structures.Node;

public class Graph<T> {
    
    //COLLECTION DE NODOS
    //SET HASH SET TREE SET
    //Set<Node> nodes;
    //MAP HASH MAP TREE MAP
    //LinkedHashSet: guarda el orden de llegada de los elementos
    //TreeSet: ordena los elementos de acuerdo a su valor
    //Map<Node, Set<Node>> nodesMap = new

    private Map<Node<T>, Set<Node<T>>> graph;
    
    public Graph() {
        this.graph = new HashMap<Node<T>, Set<Node<T>>>();
    }

    public void add(T data){
        Node<T> node = new Node<T>(data);
        graph.putIfAbsent(node, new HashSet<Node<T>>());
    }
    //primer método para agregar aristas, recibe datos en lugar de nodos
    public void addEdge(T n1, T n2) {
        Node<T> node1 = new Node<T>(n1);
        Node<T> node2 = new Node<T>(n2);
        add(n1);
        add(n2);
        graph.get(node1).add(node2);
        graph.get(node2).add(node1);
    }
    //segundo método para agregar aristas, pero recibe nodos en lugar de datos
    //public void addEdgeUni(Node<T> node1, Node<T> node2) {
        //graph.get(node1).add(node2);
        //graph.get(node2).add(node1);
    //}

    public void printGraph() {
        for (Map.Entry<Node<T>, Set<Node<T>>> entry : graph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            //for (Node<T> conecciones : entry.getValue()) {
                //System.out.println(conecciones);
            }
            System.out.println();
        
    }
}
