/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Quick Sort
/******************************************/

public class QuickSortDemo {
    
    //Description:
    //Quick sort uses divide and conquer algorithm to pick an element as pivot and 
    //partitions the given array around the picked pivot placing it in its correct position in the sorted array.
    //partition(): place the pivot at its correct position in the sorted array and put all smaller elements to the left of the pivot,
    //and all greater elements to the right of the pivot.
    //Uses the recursive method to partition and arrange the array.

    //Complexity: Bese case: O(nlog(n))
    //            Average case: O(nlog(n))
    //            Worst case: O(n^2) if already sorted.

    //Space Complexity: O(log(n)) due to recursion

    //Divide and Conquer: base case and helper function
    //Recursive function

    //Pivot element selection:
    //Pick the first element as a pivot.
    //Pick the last element as a pivot.
    //Pick a random element as a pivot.
    //Pick a middle element as a pivot.

    //Algorithm:
    //Select a pivot element. Set j as the first indexed element and i = j-1.
    //Compare the jth element with pivot element:
        // If the jth element is less than pivot element. Increase ith and jth index and swap two elements.
        // If the jth elemtne is greater than pivot element. Just, increase the jth index and compare it with the pivot element.
        // Recursively repeat the process until the pivot element and jth index collides.
        // Then, swap (i+1)th element with jth element so that pivot is in the middle of the array.
        // Divide the array from the pivot element and repeat the process.

    
        public static void main(String[] args) {

            int[] data = {9, 4, 5, 7, 2, 8, 10, 3, 1};
            
            //qickSort(array, begin, end)
            quickSort(data, 0, data.length-1);
    
            System.out.println("***********Sorted List***********");
            for(int i:data){
                System.out.print(i + " ");
            }
            
        }

        private static void quickSort(int[] data, int start, int end) {

            if (end <= start) {
                return; //base case
            }

            int pivot = partition(data, start, end);
            quickSort(data, start, pivot - 1); //left array to pivot
            quickSort(data, pivot + 1, end); //right array to pivot

        }

        private static int partition(int[] data, int start, int end) {
            
            int pivot = data[end]; //taking last elements as pivot.

            int i = start - 1; 

            //Condition 1: If jth element is less than pivot element.
            for(int j = start; j <= end - 1; j++){
                if (data[j] < pivot) {
                    i++;
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }

            //Swap the i+1 element with the pivot index element.
            i++;
            int temp = data[i];
            data[i] = data[end];
            data[end] = temp;

            return i; //pivot index
        }

}
