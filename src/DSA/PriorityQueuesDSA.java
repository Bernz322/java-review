package DSA;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuesDSA {
    /**
     * A FIFO Data Structure that serves elements w/ the highest priority first
     * before elements with lower priority
     */
    public static void main(String[] args) {
        // Queue<Double> queueGPA = new PriorityQueue<Double>();
        Queue<Double> queueGPA = new PriorityQueue<Double>(Collections.reverseOrder());

        queueGPA.offer(5.0);
        queueGPA.offer(2.5);
        queueGPA.offer(4.0);
        queueGPA.offer(1.3);
        queueGPA.offer(3.0);

        System.out.println(queueGPA);

        while (!queueGPA.isEmpty()) {
            System.out.println(queueGPA.poll());
        }
    }
}
