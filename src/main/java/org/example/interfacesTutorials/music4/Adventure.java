package org.example.interfacesTutorials.music4;


interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

interface CanClimb{
    void climb();
}

interface SideKick extends CanClimb, CanSwim{
    @Override
    void swim();

    @Override
    void climb();

    void CanTalk();
}


class ActionCharacter{
    public void fight() {};
}

// Hero is a subclass of ActionCharacter and
// actioncharacter implements a fight method hence when Hero implements canfly and canswim their methods are overwritten
// but canfight is not
class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb, SideKick {
    public void swim() {}

    public void fly() {}

    public void climb() {}

    @Override
    public void CanTalk() {}

}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void y(CanClimb x) {
        x.climb();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

//    public void Sequence(int size) { items = new Object[size]; }

    public static void main(String[] args){
        Hero h = new Hero();
        t(h); //Treat it as CanFight
        u(h); //Treat it as CanSwim
        v(h); //Treat it as CanFly
        y(h); //Treat it as CanClimb
        w(h); //Treat it as ActionCharacter
    }
} ///:~
