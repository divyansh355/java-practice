import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * LinkedList = stores Nodes in 2 parts (data + address)
         *              Nodes are in non-consecutive memory locations
         *              Elements are linked using pointers
         *          
         *                          Singly Linked List
         *           Node                   Node                   Node
         *      [data | address]  -->   [data | address]  -->  [data | address]
         * 
         *                          Doubly Linked List
         *                  Node                          Node
         *     [address | data | address]  <--->  [address | data | address]
         * 
         *          advantages?
         *          1. Dynamic Data Structure (allocates needed memory while running) 
         *          2. Insertion and Deletion of Node.js easy. O(1)
         *          3. No/Low memory waste
         * 
         *          disadvantages?
         *          1. Greater memory usage (additional pointer)
         *          2. No random access of elements (no index [i] )
         *          3. Accessing/Searching elements is more time consuming. O(n)
         * 
         *          uses?
         *          1. implements Stacks/Queues
         *          2. GPS Navigation
         *          3. music playlist
         */

        LinkedList <String> linkedList = new LinkedList<String>();
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        linkedList.add(4, "E");
        linkedList.remove("F");
        // System.out.println(linkedList.indexOf("E"));

        // System.out.println(linkedList.peekFirst());
        // System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(first);
        System.out.println(last);

        System.out.println(linkedList);
    }
}
