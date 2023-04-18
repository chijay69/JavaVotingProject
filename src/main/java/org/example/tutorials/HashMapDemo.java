package org.example.tutorials;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("a", 10);
        hashmap.put("b", 20);
        hashmap.put("c", 30);

        System.out.println("Size of hashmap is " + hashmap.size());
        System.out.println("hashmap has key a: " + hashmap.containsKey("a"));
        System.out.println("hashmap has value 20: " + hashmap.containsValue(20));
        System.out.println(hashmap);

        for (int value:
             hashmap.values()) {
            System.out.print(value + " ");
        }

        System.out.println(" ");

        for (String key:
             hashmap.keySet()) {
            System.out.print("key:"+key+" value:"+hashmap.get(key)+ " ");
        }

        System.out.println(" ");

        for (Entry<String, Integer> entry:
             hashmap.entrySet()) {
            System.out.println("key:"+entry.getKey()+" value:"+entry.getValue()+"; ");
        }
    }
}
