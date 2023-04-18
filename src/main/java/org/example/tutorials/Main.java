package org.example.tutorials;

public class Main {
    public static void main(String[] args) {

        Student student_John = new Student("John", "Ackman");
        student_John.setAddress("18 keffi street ikoyi.");
        student_John.setAge(27);
        student_John.setGrade(89);

        System.out.println("John's age is " + student_John.getAge());
        System.out.println("John's address: " + student_John.getAddress());
        System.out.println();
        System.out.println(student_John);

        /*
        new class definition
         */
        Cuboid cube = new Cuboid();
        Cuboid cube1 = new Cuboid(11);
        Cuboid cube2 = new Cuboid(12, 11);
        Cuboid cube3 = new Cuboid(5, 4, 5);

        System.out.println(cube);
        System.out.println("Cube volume: "+cube.Volume());

        System.out.println(cube1);
        System.out.println("Cube1 volume: "+cube1.Volume());

        System.out.println(cube2);
        System.out.println("Cube2 volume: "+cube2.Volume());

        System.out.println(cube3);
        System.out.println("Cube3 volume: "+cube3.Volume());
    }
}
