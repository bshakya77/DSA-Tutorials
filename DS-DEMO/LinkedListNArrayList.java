/******************************************/
// Author: Bijay Shakya
// Data Structure Comparision: LinkedList vs ArrayList
/******************************************/

import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedListNArrayList {

    //Comparision: 
    //1. ArrayList is more preferrable and faster when we are searching/accessing for elements.
    //2. LinkedList is more faster when removing first/last element.
    //3. ArrayList is more faster when removing the random elements in the middle.

    public static void main(String[] args) {
        
        long startTime;
        long endTime;
        long elapsedTime;

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        
        /**************************LinkedList****************************/
        startTime = System.nanoTime();
        //linkedList.get(999999);
        //linkedList.remove(0);
        linkedList.remove(999999);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.printf("Linked List Elapsed Time: %s%n", elapsedTime + " ns");

        /**************************ArrayList****************************/
        startTime = System.nanoTime();
        //arrayList.get(999999);
        //arrayList.remove(0);
        arrayList.remove(999999);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.printf("Array List Elapsed Time: %s%n", elapsedTime + " ns");
        // System.out.printf("Peek Item: %s%n", peekItem);
        // System.out.printf("Search Item: %d%n", searchItem);
        // System.out.printf("Popped Item: %d%n", poppedItem);
        // System.out.printf("Is Empty? : %b%n", stack.empty());
    }
}
