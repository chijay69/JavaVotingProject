package org.example.rodents;

abstract class Human {
    Human(){
       this.print();
    }
    abstract void print();
}

class Chidi extends Human{

    private int age = 0;

    public Chidi(){
    }
    public Chidi(int age1){
        this.age = age1;
    }
    @Override
    void print() {
        if (age == 0) {
            System.out.println("My age was not given.");
        }else {
            System.out.println("My age is " + age);
        }
    }
}