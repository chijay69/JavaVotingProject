package org.example.tutorials;

import java.util.LinkedList;
import java.util.Stack;

public class stackDemo<T> {
    private final LinkedList<T> storage = new LinkedList<>();
    public void push(T v) {
        storage.addFirst(v);
    }
    public String peek(){
        return (String) storage.getFirst();
    }
    public String pop(){
        return (String) storage.removeFirst();
    }
    public Boolean empty(){
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stackDemo<String> stackDemo = new stackDemo<>();

        stack.push("America");
        stack.push("Germany");
        stack.push("India");
        stack.push("Britain");

        // Stack Demo
        stackDemo.push("America");
        stackDemo.push("Germany");
        stackDemo.push("India");
        stackDemo.push("Britain");

        System.out.println("original stack: "+ stack);
        String poppedElement = stack.pop();
        System.out.println("poppedElement: " + poppedElement);
        String poppedElement1 = stack.peek();
        System.out.println("peeked: " + poppedElement1);
        System.out.println("What the stack looks like: "+ stack);

        // Stack Demo
        System.out.println("stackDemo original stack: "+ stackDemo);
        System.out.println("stackDemo poppedElement: " + stackDemo.pop());
        System.out.println("stackDemo peeked: " + stackDemo.peek());
        System.out.println("What the stackDemo looks like: "+ stackDemo);
    }
}
