package collections.sets.maps;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Maps {
    //Map<K,V>
    //Map<Tipo de la clave, Tipo del valor>
    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 50);
        System.out.println(map.size());
        System.out.println(map);    
        System.out.println(map.values().toArray());

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.values().toArray()[i]);
        }
        // MAP -> K -> SET -> VALOR DEL SET
        for (String key : map.keySet()) {
            System.out.println(key);
        }//A, B, C

        //SET<t>
        //T = ENTRY<K,V>
        //T = ENTRY<S, I>
        //SET<ENTRY<S,I>>

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        return map;
    }
    
    public LinkedHashMap<String, Integer> construirLinkedHashMap() {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 10);
        linkedHashMap.put("B", 20);
        linkedHashMap.put("A", 30);
        linkedHashMap.put("D", 5);
        linkedHashMap.put("F", 3);
        linkedHashMap.put("G", 8);
        linkedHashMap.put("H", 85);
        linkedHashMap.put("I", 5);
        System.out.println("----- LinkedHashMap -----");        
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.entrySet());

        return linkedHashMap;
    }

    public Map<String, Integer> construirTreeMap() {
        Map<String, Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("A", 10);
        treeMap.put("B", 20);
        treeMap.put("A", 30);
        treeMap.put("D", 5);
        treeMap.put("F", 3);
        treeMap.put("G", 8);
        treeMap.put("H", 85);
        treeMap.put("I", 5);
        System.out.println("----- TreeMap -----");        
        System.out.println(treeMap);
        System.out.println(treeMap.entrySet());

        return treeMap;
    }
}
