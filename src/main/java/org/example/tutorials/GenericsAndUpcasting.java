package org.example.tutorials;


import java.util.ArrayList;
import java.util.List;

class GrannySmith extends Apples {
    @Override
    public String toString() {
        return super.toString();
    }
}
class Gala extends Apples {
    @Override
    public String toString() {
        return super.toString();
    }
}
class Fuji extends Apples {
    @Override
    public String toString() {
        return super.toString();
    }
}
class Braeburn extends Apples {
    @Override
    public String toString() {
        return super.toString();
    }
}


public class GenericsAndUpcasting {
    public static void main(String[] args) {
        List<Apples> apples = new ArrayList<>();
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        apples.add(new GrannySmith());

        for (Apples apple:
             apples) {
            System.out.println(apple.Id());
            System.out.println(apple);
        }
    }
}
