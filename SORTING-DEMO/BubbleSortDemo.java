/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Bubble Sort
/******************************************/

public class BubbleSortDemo {

    //Description
    //Light or small element floats at the top of the array as bubble.
    //Algorithm: compare the two elements at a time and swap if they are not in increasing order.
    //Requires one tracking variable: temp
    //Complexity: O(n^2) --> quadratic 
    //Space Complexity: O(1)

    //Advantages:
    //Easy to implement and understand.
    //In-place sort, no additional temporary memory required.
    //Detects whether the input is already sorted. Best case: O(n)
    //Stable algorithm for many applications.

    //Disadvantages:
    //Poor efficiency on large datasets.
    //Performance is affected if the dataset is large.
    //Lack of practical usage.

    //Usage:
    //When the list is small and almost sorted.


    public static void main(String[] args) {

        int[] data = {9, 4, 5, 7, 2, 8, 10, 3, 1};
        
        bubbleSort(data);

        System.out.println("***********Sorted List***********");
        for(int i: data){
            System.out.print(i + " ");
        }
        
    }

    private static void bubbleSort(int[] data) {
        for(int i = 0; i < data.length - 1; i++){  //n
            for(int j = 0; j < data.length - i - 1; j++){  //n
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
