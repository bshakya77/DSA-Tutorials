/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Linear search
/******************************************/

public class LinearSearchDemo {
    
    // Defination: Iterates through a data collection one element at a time.
    // Complexity: O(n)

    // Advantages:
    // 1. Fast for searches in small to medium datasets.
    // 2. No need to be sorted.
    // 3. Useful for data structures that do not have random access like Linked List.

    // Disadvantages:
    // 1. Slow for large datasets.

    public static void main(String[] args) {

        int[] data = {9, 4, 5, 7, 2, 8, 10};
        int index = linearSearch(data, 8);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found !!");
        }
        
    }

    private static int linearSearch(int[] data, int value) {

        for(int i = 0; i < data.length; i++){

            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
