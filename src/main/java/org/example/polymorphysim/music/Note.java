package org.example.polymorphysim.music;

public enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
} ///:~

//: polymorphism/music/Instrument.java
//package polymorphism.music;
//import static net.mindview.util..*;
//class Instrument {
//    public void play(Note n) {
//        ("Instrument.play()");
//    }
//}
/////:~
////: polymorphism/music/Wind.java
//package polymorphism.music;
//// Wind objects are instruments
//// because they have the same interface:
//public class Wind extends Instrument {
//    // Redefine interface method:
//    public void play(Note n) {
//        System.out.ln("Wind.play() " + n);
//    }
//} ///:~
////: polymorphism/music/Music.java
//// Inheritance & upcasting.
//package polymorphism.music;
//public class Music {
//    public static void tune(Instrument i) {
//// ...
//        i.play(Note.MIDDLE_C);
//    }
//    public static void main(String[] args) {
//        Wind flute = new Wind();
//        tune(flute); // Upcasting
//    }
//} /* Output:
//Wind.play() MIDDLE_C
//*///:~
