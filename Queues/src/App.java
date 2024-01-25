import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Queue = FIFO data structure. First-In First-Out
         *         A collection designed for holding elements prior to processing
         *         Linear data structure
         * 
         *         add = enqueue, offer()
         *         remove = dequeue, poll()
        */
        Queue <String> queue = new LinkedList<String>();

        queue.offer("Varun");
        queue.offer("Jitesh");
        queue.offer("Gourav");
        queue.offer("Devanshu");
        // System.out.println(queue);
        // System.out.println(queue.isEmpty()); // To check the queue is EMPTY or not.
        // System.out.println(queue.contains("Jitesh")); /* To check that the particular element is there or not. */
        System.out.println(queue.size());

        // System.out.println(queue.peek()); // This will return the TOPMOST Value of the QUEUE.

        // queue.poll();
        // queue.poll();
        // queue.poll();
        // queue.poll(); /*This method does not thorws an error, even if the element is not present in the QUEUE*/
        // queue.element();
        // System.out.println(queue);

        /*
         * Where are queues useful?
         * 
         * 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
         * 2. Printer Queue (Print jobs should be completed in order)
         * 3. Used in LinkedLists, PriorityQueues, Breadth-first search
         */
    }
    
}
