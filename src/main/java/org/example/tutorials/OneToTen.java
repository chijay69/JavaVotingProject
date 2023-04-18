package org.example.tutorials;

public class OneToTen {
    public static void main(String[] args) {
        int result = 0;
        int counter = 0;
        int counters = 0;
        for (int i = 0; i <= 10; i++) {
            counters = counter++;
            System.out.println(counters);
            result = counters;

        }
    }
}
