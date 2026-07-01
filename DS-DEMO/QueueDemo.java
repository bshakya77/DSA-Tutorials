/******************************************/
// Author: Bijay Shakya
// Data Structure: Queue and its Operations
/******************************************/

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    
    public static void main(String[] args) {
        
        // Defination:
        // Stores elements in First-In First Out (FIFO)
        // Sorts the object in "Linear Line"
        // there is head and tail pointer for adding and removing an element
        // add = enqueue, offer()
        // remove = dequeue, poll()
        
        // Uses of Queue:
        // 1. Keyboard Buffer (letters should be appear on the screen as entered)
        // 2. Printer Queue (Print jobs should be completed in order as they come)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-First Search
 
        
        //Queue is an interface, so we cannot instantiate it. So, it has to be instantiate as Linked List or Priority Queue as per operations.
        Queue<String> queue = new LinkedList<String>();
        
        
        // Queue Operations
        queue.offer("Kushal");
        queue.offer("Karan");
        queue.offer("Sompal");
        queue.offer("Gulshan");
        queue.offer("Deependra");
        
        String opener = queue.poll();  //returns empty array if queue is empty
        
        String peekItem = queue.peek(); //returns/examines the top item on the queue does not throw error if empty
        
        String searchItem =  queue.element(); //throws empty exception if the queue is empty

        
        // Display the results
        System.out.println(queue);
        System.out.printf("Opener: %s%n", opener);
        System.out.printf("Peek Item: %s%n", peekItem);
        System.out.printf("Search Item: %s%n", searchItem);
        System.out.printf("Is Empty? : %b%n", queue.isEmpty());
        System.out.printf("Size : %d%n", queue.size());
        System.out.printf("IsContain? : %b%n", queue.contains("Sompal"));
    }
}
