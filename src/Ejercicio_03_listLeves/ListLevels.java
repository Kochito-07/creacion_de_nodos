package Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Ejercicio_01_insert.Node;

public class ListLevels {
    
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new LinkedList<>();
            
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode);
                
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        
        return result;
    }
}