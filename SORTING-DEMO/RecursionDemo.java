/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Recursion 
/******************************************/

public class RecursionDemo {

    //Description:
    //Apply the result of a function, to a function.
    //A recursive method calls itself directly or indirectly.
    //Can be used as a substitute for iteration. 
    //Divide a problem into sub-problems of the same type as the orginal.
    //Uses LIFO method
    // Two elements: base condition and recursive condition

    //Advantages:
    //Complex problems can be sub-divided into simple forms.
    //Simple to implement or read.

    //Disadvantages:
    //Requires more memory and time.
    //Challenging for debugging.

    //Application:
    //Useful for Divide and Conquer problems: Implementation of Merge Sort.

    
    public static void main(String[] args) {
        
        System.out.println("Iterative Methods" + "\n");
        walk(5);
        
        System.out.println("\n" + "Recursive Methods" + "\n");
        walk_recursive(5);

        int factor = 6;
        int factorial = factorial(factor);
        System.out.println("\n" + "Factorization of " + factor  + ": " + factorial);
        
        int base = 2;
        int exponent = 8;
        int pn = power(base, exponent);
        System.out.println("\n" + base + " Power of " + exponent  + ": " + pn);
    }

    private static void walk(int steps) {
       
        for(int i = 1; i <= steps; i++){
            System.out.println("You are at step: " + i);
        }
    }

    private static void walk_recursive(int steps) {
       
        if (steps < 1) return; //base case
        System.out.println("You are at steps: " + steps);
        walk_recursive(steps - 1);
    }

    private static int factorial(int n) {
       
        if (n < 1) return 1; //base case
        return n * factorial(n-1);
    }

    private static int power(int base, int exponent) {
       
        if (exponent < 1) return 1; //base case
        return base * power(base, exponent - 1);
    }
}
