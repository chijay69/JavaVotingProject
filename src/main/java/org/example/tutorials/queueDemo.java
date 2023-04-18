package org.example.tutorials;

import java.util.PriorityQueue;
import java.util.Queue;

public class queueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("India");
        queue.add("Germany");
        queue.add("America");

        System.out.println("Queue: "+queue);

        queue.remove();
        System.out.println("Queue after removing the head element: "+queue);

        String head;
        head = queue.peek();
        System.out.println("Head of queue: "+head);

        head = queue.poll();
        System.out.println("Poll Head of queue: "+head);

        System.out.println("Queue after polling the head element: "+queue);
    }
}
