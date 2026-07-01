
/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Merge Sort
/******************************************/

public class MergeSortDemo {
    
    //Description:
    //Divide, Conquer, Merge problem.
    //Follows recursion method to divide, sort and merge array into the sub array.
    //Complexity: O(nlogn) --> quasilinear time
    //Space Complexity: O(n) --> extra space for subarrays

    //Advantages:
    //Stable algorithm.
    //Worst case time O(nlogn)
    //Simple to implement

    //Disadvantages:
    //Space complexity
    //Not in place algorithm. --> requires additional memory to store the sorted data.

    //Applications:
    //Sorting large datasets.
    //Inversion Counting.
    //Finding the median of an array.


    public static void main(String[] args) {

        int[] data = {9, 4, 5, 7, 2, 8, 10, 3, 1};
        
        mergeSort(data);

        System.out.println("***********Sorted List***********");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        
    }

    private static void mergeSort(int[] data) {

        int length = data.length;
        if (length <= 1) return; //base case

        int middle =  length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray =  new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for(; i < length; i++){
            if (i < middle) {
                leftArray[i] = data[i]; 
            }
            else{
                rightArray[j] = data[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, data);
    }

    //3 arrays used to split
    private static void merge(int[] leftArray, int[] rightArray, int[] data){
        
        int leftSize = data.length / 2;
        int rightSize = data.length - leftSize;
        int i = 0, l = 0, r = 0;

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                data[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                data[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            data[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            data[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
