package org.example.interfacesTutorials.music4;

import org.example.polymorphysim.music.Note;


abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String what() {
        /* ... */
        return "Instrument";
    }
    abstract void adjust();

    void print(String s) {
        System.out.println(s);
    }

}

class Wind extends Instrument {


    @Override
    public void play(Note n) {

    }

    @Override
    public String what() {
        /* ... */
        return "Wind";
    }

    @Override
    void adjust() {

    }
}


class Percussion extends Instrument{

    @Override
    public void play(Note n) {

    }

    @Override
    public String what() {
        /* ... */
        return "Percussion";
    }

    @Override
    void adjust() {

    }
}

class Stringed extends Instrument{


    @Override
    public void play(Note n) {

    }

    @Override
    public String what() {
        /* ... */
        return "Stringed";
    }
    @Override
    void adjust() {

    }
}

class Brass extends Wind{
    public void play(Note n) {
        print("Brass.play() " + n);
    }
    public void adjust() { print("Brass.adjust()"); }
}

class Woodwind extends Wind{
    public void play(Note n) {
        print("Woodwind.play() " + n);
    }
    public String what() { return "Woodwind"; }
}


public class Music4 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
    // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        /* Upcasting during addition to the array: */
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
/* Output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*///:~