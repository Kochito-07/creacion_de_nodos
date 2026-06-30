package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Sets() {
    }
    
    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B"); 
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("F");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");
        
        return linkedHashSet;
    }
    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");

        
        return treeSet;
    }

    public Set<Contacto> construirTreeSetConComparador() {

        Set<Contacto> set = new TreeSet<>((c1, c2)-> { return c1.getNombre().compareTo(c2.getNombre()); });

        set.add(new Contacto("Juan", "Perez", "123456789"));
        set.add(new Contacto("Ana", "Gomez", "987654321"));
        set.add(new Contacto("Pedro", "Lopez", "456789123"));
        set.add(new Contacto("Maria", "Rodriguez", "789123456"));
        set.add(new Contacto("Juan", "Chang", "123456789"));
        return set;
    }

    public Set<Contacto> construirHashSetContacto() {
        Set<Contacto> hSet = new HashSet<>();

        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        hSet.add(c1);
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        hSet.add(c2);
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");
        hSet.add(c3);
        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        hSet.add(c4);
        Contacto c5 = new Contacto("Juan", "Perez", "123456789");
        hSet.add(c5);
        System.out.println("Contacto c1: " + c1);
        

        return hSet;
    }   

    
}
