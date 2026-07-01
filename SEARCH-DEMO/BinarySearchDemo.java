/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Binary search
/******************************************/

public class BinarySearchDemo {

    // Description:
    // Binary Search algorithm finds the position of a target value within a sorted
    // array.
    // It first search if the value is in the middle index.
    // If not, eliminates one of the array based on greater than or less than mid
    // value.
    // It recursively continues to split the remaining array in the middle until the
    // value is found.
    // Complexity: O(log(n))

    // Advantages:
    // Useful for the large dataset.
    // Fast search time.
    // Works on sorted data.
    // Uses less memory.

    // Disadvatanges:
    // Requires the elements to be sorted.
    // Not efficent for small arrays.
    // Poor performance on linked list.
    // Repeated elements cause inefficiency.

    public static void main(String[] args) {

        int[] data = new int[400000];
        int target = 1756;

        long start = System.nanoTime();

        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        int index = binarySearch(data, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println(target + " not found.");
        }

        long duration = (System.nanoTime() - start) / 1000000;

        System.out.println("Runtime: " + duration + "ms");

    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target) { // value less than target, set low.
                low = middle + 1;
            } else if (value > target) { // value more than target, set high.
                high = middle - 1;
            } else {
                return middle; // Target is found
            }
        }
        return -1; // Target not found
    }
}
