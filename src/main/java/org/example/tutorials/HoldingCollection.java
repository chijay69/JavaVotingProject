package org.example.tutorials;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HoldingCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            c.add(i);
        }
        for (Integer i :
                c) {
            System.out.println(i);
        }

        System.out.println("List Above, Set Below ");

        Collection<Integer> d = new HashSet<>(5);
        for (int i = 0; i < 5; i++) {
            d.add(i);
        }
        for (Integer i : d) {
            System.out.println(i);
        }
    }
}
