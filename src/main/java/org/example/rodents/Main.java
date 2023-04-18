package org.example.rodents;

public class Main {
    public static void main(String[] args) {
        Gerbil gerbil = new Gerbil();
        Hamster hamster = new Hamster();
        Mouse mouse = new Mouse();
        Chidi chidi = new Chidi(33);
        Rodent[] rodents = {gerbil, hamster, mouse};

        for (Rodent r:
             rodents) {
            r.name();
            r.Eat();
        }

        chidi.print();
    }
}
