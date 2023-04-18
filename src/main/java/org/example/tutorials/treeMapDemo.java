package org.example.tutorials;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class treeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3,"A");
        treeMap.put(1,"C");
        treeMap.put(2,"B");

        System.out.println(treeMap);

        for (Entry<Integer, String> entry:
             treeMap.entrySet()) {
            System.out.print(entry.getKey()+ ":" + entry.getValue()+ "; ");
        }
    }
}
