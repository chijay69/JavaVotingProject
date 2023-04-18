package org.example.tutorials;

class Apples {
    private static long counter;
    private final long id = counter++;

    public long Id() {
        return id;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "id=" + id +
                '}';
    }
}
