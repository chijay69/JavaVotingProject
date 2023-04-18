package org.example.tutorials;

import java.util.HashSet;
import java.util.*;

public class PrintingContainers {

    static void print(String s){
        System.out.println(s);
    }
    static Collection<String> fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map<? extends String, ? extends String> fill(Map<String,String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }
    public static void main(String[] args) {
        print(fill(new ArrayList<String>()).toString());
        print(fill(new LinkedList<String>()).toString());
        print(fill(new HashSet<String>()).toString());
        print(fill(new TreeSet<String>()).toString());
        print(fill(new LinkedHashSet<String>()).toString());
        print(fill(new HashMap<String,String>()).toString());
        print(fill(new TreeMap<String,String>()).toString());
        print(fill(new LinkedHashMap<String,String>()).toString());
    }
}