/**********************************************/
// Author: Bijay Shakya
// Data Structure: LinkedList and its Operations
/**********************************************/

import java.util.LinkedList;

public class LinkedListDemo {
    
    public static void main(String[] args) {
        
        // Defination:
        // ArrayList has issue to add and remove element from random position. Shifting of nodes required.
        // Singly Linkedlist: Addresses this problem by using pointers. But searching is difficult in LinkedList.
        // Node Structure: (Head), Node (Data | Address to next node), Tail (NULL)
        // Doubly Linkedlist: Address the search issue by using two address to traverse through the chain of nodes. But requires large memory.
        // Node Structure: (Head), Node (Address to previous node | Data | Address to next node), Tail (NULL)
        // Can be used as both stack and queue. Provides all the operation function of stack and queue.
        // Additional operations: can peek, remove, add in specfic position.
        
        // Advantages of LinkedList:
        // 1. Dynamic Data Structure (allocates needed memory while running)
        // 2. Easier Insertion and Deletion O(1)
        // 3. No/Low memory waste

        // Disadvantages of LinkedList:
        // 1. Greater memory usage (additional pointers)
        // 2. No random access of elements (no index[i])
        // 3. Accessing/searching elements is more time consuming. O(n)
 
        // Uses of LinkedList:
        // 1. Applications: Image Viewer, Music player, GPS Navigation
        // 2. Task Scheduling, Image processing (pixels as node), File Systems
        // 3. Speech Recognition
        // 4. Implementation of Stack, Queue, Hash Table, Binary tree

        //LinkedList can be used as Stack or Queue

        // Stack Operations
        LinkedList<String> linkedListStack = new LinkedList<String>();
        linkedListStack.push("New York");
        linkedListStack.push("Florida");
        linkedListStack.push("Texas");
        
        
        // Display the results
        System.out.println("\nLinked List as Stack:");
        System.out.println(linkedListStack);
        String poppedItem = linkedListStack.pop();
        System.out.printf("Popped Item: %s%n", poppedItem);
        System.out.println(linkedListStack);
        
        // Queue Operations
        LinkedList<String> linkedListQueue = new LinkedList<String>();
        linkedListQueue.offer("California");
        linkedListQueue.offer("Alabama");
        linkedListQueue.offer("Maryland");
        linkedListQueue.offer("Nevada");

       
        System.out.println("\nLinked List as Queue:");
        System.out.println(linkedListQueue);
     
        String top = linkedListQueue.poll();  //returns empty array if queue is empty
        System.out.printf("Top State: %s%n", top);
        


        //LinkedList Operations
        System.out.println("\nLinked List Operations:");
        System.out.println(linkedListQueue);
        linkedListQueue.add(2, "South Dakota");
        linkedListQueue.addFirst("Utah");
        linkedListQueue.addLast("Alaska");
        System.out.println(linkedListQueue);
        String removedItem = linkedListQueue.removeFirst();

        // Display the results
        System.out.println(linkedListQueue);
        System.out.printf("First Peek Item: %s%n", linkedListQueue.peekFirst());
        System.out.printf("Last Item: %s%n", linkedListQueue.peekLast());
        System.out.printf("Removed Item: %s%n", removedItem);
        System.out.printf("Final LinkedList : %s%n", linkedListQueue);
    }


}
