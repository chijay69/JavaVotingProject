package org.example.processor;
import java.util.Arrays;

class Processors {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process (Object input) { return  input; }
}

class Upcase extends Processors{
    String process (Object input) {
        // Covariant return
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processors{
    String process (Object input) {
        // Covariant return
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processors {
    String process(Object input) {
    // The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply{
    public static void process(Processors p, Object s){
        print("Using Processor " + p.name());
        print(p.process(s));
    }

    private static void print(Object x) {
        System.out.println(x);
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }/* Output:
Using Processor Upcase
DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT
Using Processor Downcase
disagreement with beliefs is by definition incorrect
Using Processor Splitter
[Disagreement, with, beliefs, is, by, definition, incorrect]
*///:~
}