/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Insertion Sort
/******************************************/

public class InsertionSortDemo {

    //Description: In-place sorting. Takes i+1 element as "temp" and after comparing all elements to the left shift elements to the right if the element is greater than the i+1 indexed element until the element ot the left is smaller.
    //Algorithm uses "temp" variable to track i+1 element.
    //Complexity: Average/Worst case: O(n^2)
    //Best case: O(n)

    //Space Complexity: O(1)

    //Advantages:
    //Better than Bubble sort and Selection Sort.
    //Space efficient
    //Efficient for small and nearly sorted list.

    //Disadvantages:
    //Inefficient for large datasets.
    
    


    public static void main(String[] args) {

        int[] data = {9, 4, 5, 7, 2, 8, 10, 3, 1};
        
        insertionSort(data);

        System.out.println("***********Sorted List***********");
        for(int i: data){
            System.out.print(i + " ");
        }
        
    }

    private static void insertionSort(int[] data) {
       
        //we start from index 1 so, i = 1 and place the element in temp.

        for(int i = 1; i < data.length; i++){
            int temp = data[i];
            int j = i - 1;

            while(j >= 0 && data[j] > temp){
                data[j+1] = data[j];
                j--;
            }

            data[j+1] = temp;

        }

    }
}
