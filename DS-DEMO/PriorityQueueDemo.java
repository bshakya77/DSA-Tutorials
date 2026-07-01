/******************************************/
// Author: Bijay Shakya
// Data Structure: Priority Queue and its Operations
/******************************************/

import java.util.*;;

public class PriorityQueueDemo {
    
    public static void main(String[] args) {
        
        // Defination:
        // Stores elements in First-In First Out (FIFO)
        // Severs the element with the highest priorities first before elements with lower priority.
        // add = enqueue, offer()
        // remove = dequeue, poll()
        
        //Uses of Priority Queue:
        // 1. Algorithms: Dijkstra's Shortest Path Algorithm, Prim's algorithm, Data compression (Huffman), Heap Sort.
        // 2. Event simulations, Bandwidth management

 
        //Queue is an interface, so we cannot instantiate it. So, it has to be instantiate as Linked List or Priority Queue as per operations.
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        
        // Priority Queue Operations
        queue.offer(4.0);
        queue.offer(7.5);
        queue.offer(8.0);
        queue.offer(6.5);
        queue.offer(2.5);
        
        // Display the results
        
        System.out.println("****GPA Order****");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); //returns the elements in sorted reverse order (works with alphabets too)
        }
    }
}
