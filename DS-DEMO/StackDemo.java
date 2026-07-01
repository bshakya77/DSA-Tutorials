/******************************************/
// Author: Bijay Shakya
// Data Structure: Stack and its Operations
/******************************************/

import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        
        // Defination:
        // Stores elements in Last-In First Out (LIFO)
        // Sorts the object in "vertical tower"
        
        // Uses of Stacks:
        // 1. Undo/Redo features in text editors
        // 2. Moving back/Forward through browser history
        // 3. Backtracking algorithms (Maze problem, file directories)
        // 4. Calling Functions or Call Stack
        
        Stack<String> stack = new Stack<String>();
        
        // Stack Operations
        stack.push("Nepal");
        stack.push("Bangladesh");
        stack.push("Netherlands");
        stack.push("Srilanka");
        stack.push("South Africa");
        
    
        String winner = stack.pop();  //throws EmptyStackException if stack is empty
        
        String peekItem = stack.peek(); //returns the top item on the stack
        
        int searchItem =  stack.search("Nepal"); 

        int poppedItem =  stack.search("South Africa"); //returns -1 if item not found

        //for(int i=0; i < 1000000000; i++){
           // stack.push("Ireland"); //returns Java heap space exception if out of memory
        //}
        
        // Display the results
        System.out.println(stack);
        System.out.printf("Winner: %s%n", winner);
        System.out.printf("Peek Item: %s%n", peekItem);
        System.out.printf("Search Item: %d%n", searchItem);
        System.out.printf("Popped Item: %d%n", poppedItem);
        System.out.printf("Is Empty? : %b%n", stack.empty());
    }
}