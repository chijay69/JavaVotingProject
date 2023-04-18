package org.example.tutorials;

import java.util.Set;

public class HashSet<S> {
    public static void main(String[] args) {
        Set<String> hashSet = new java.util.HashSet<>();
        hashSet.add("C");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("B");



        System.out.println(hashSet);
        System.out.println("List contains C or not? " + hashSet.contains("C"));

        hashSet.remove("A");
        System.out.println("hashSet after removing A ");

        for (String item:
             hashSet) {
            System.out.println(item);
        }

    }
}
