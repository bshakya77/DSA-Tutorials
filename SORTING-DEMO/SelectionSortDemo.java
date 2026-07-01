/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Selection Sort
/******************************************/

public class SelectionSortDemo {
    //Description:
    //Suppose the first index elements as min element and then find if there is any min number element compared to the supposed index element in each iterations and replace the index in ascending order with min element and swap until the element is sorted.
    //Requires two tracking variables: min and temp. Each variable is cleared in each iteration.
    //Complexity: O(n^2)
    //Space Complexity: O(1) --> extra space for swap

    public static void main(String[] args) {

        int[] data = {9, 4, 5, 7, 2, 8, 10, 3, 1};
        
        selectionSort(data);

        System.out.println("***********Sorted List***********");
        for(int i: data){
            System.out.print(i + " ");
        }
        
    }

    private static void selectionSort(int[] data) {
       
        for(int i = 0 ; i < data.length -1; i++){
            
            int min = i;
            for(int j = i+1; j < data.length; j++){
                if (data[min] > data[j]) {  //reverse the greater than sign to order it desc order.
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}
