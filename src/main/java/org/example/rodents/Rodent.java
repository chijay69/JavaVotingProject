package org.example.rodents;

abstract class Rodent {

    Rodent() {
    }
    abstract void Bite ();
    void Eat() {
        this.Bite();
    }
    abstract void name();
}

class Mouse extends Rodent{
    Mouse() {
        super();
    }

    @Override
    void Bite() {
        System.out.println("Mouse incisors");
    }

    @Override
    void name() {
        System.out.println("Mouse");
    }
}
class Gerbil extends Rodent{
    Gerbil() {
        super();
    }

    @Override
    void Bite() {
        System.out.println("Gerbil incisors");
    }

    @Override
    void name() {
        System.out.println("Gerbil");
    }
}
class Hamster extends Rodent{
    Hamster() {
        super();
    }

    @Override
    void Bite() {
        System.out.println("Hamster incisors");
    }

    @Override
    void name() {
        System.out.println("Hamster");
    }
}