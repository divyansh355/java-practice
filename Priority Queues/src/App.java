import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Priority Queues = A FIFO data structure that serves elements
         *                  with the highest priorites first 
         *                  before elements with lower priority
         */

        Queue <Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // Queue <Double> queue = new PriorityQueue<>(Collections.reverseOrder());/* This will print the QUEUE in the reverse order. */
        // queue.offer(3.0);
        // queue.offer(2.5);
        // queue.offer(4.0);
        // queue.offer(1.5);
        // queue.offer(2.0);

        // while (!queue.isEmpty()) {
        //     System.out.println(queue.poll());
        // }
        
    }
}
