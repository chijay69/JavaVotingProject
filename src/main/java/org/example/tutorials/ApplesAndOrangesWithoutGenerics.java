package org.example.tutorials;


import java.util.ArrayList;
import java.util.List;


public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Apples> apples= new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apples());
        }
        // Not prevented from adding an Orange to apple
//        apples.add(new Orange());

        for (Apples apple : apples) {
            System.out.println(apple.Id());
            // Orange is detected only at runtime
        }
    }
}

