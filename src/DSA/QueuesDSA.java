package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesDSA {
    // A FIFO Data Structure - First-In-First-Out (like a line of people)
    /**
     * enqueue is the term for adding - offer()
     * dequeue is the term for removing - poll()
     * Queue is an interface, not a class. Notice how we create a queue by
     * implementing linked list
     * Queues inherits the Collection class, so we can use methods from that class
     */

    /**
     * Uses:
     * Keyboard buffer (what is pressed first must be displayed first)
     * Printing queue (printing must be done in order)
     * Used in LinkedList, PriorityQueues, Bread-first search
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Mario");
        queue.offer("Maria");

        System.out.println(queue); // [Karen, Chad, Mario, Maria]
        System.out.println("==============");
        queue.poll();
        // Print the queue except the first one (removed)
        System.out.println(queue); // [Chad, Mario, Maria]
        System.out.println("==============");
        // Print the 1st one
        System.out.println(queue.peek()); // Chad

        // queue.isEmpty() //false
        // queue.size() // 3
        // queue.contains("Chad") // true
    }
}
