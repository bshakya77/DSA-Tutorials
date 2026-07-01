/******************************************/
// Author: Bijay Shakya
// Search Algorithm: Interpolation Search
/******************************************/
public class InterpolationSearchDemo {
    
    //Interpolation Search: improvement over binary search 
    //Best used for "uniformly" distributed data "guesses" where a value might be based on calculated probe results.
    //If probe is incorrect, search area is narrowed, and a new proble is calculated.

    //Average case: O(log(log(n)))
    //Worst case: O(n) --> values increase exponentially
    
    public static void main(String[] args) {

        int[] data = {1, 2, 4, 8, 16, 32, 64}; //uniformly distibuted
        int target = 32;
        int index = interpolationSearch(data, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println(target + " not found.");
        }
        
    }

    private static int interpolationSearch(int[]array, int target) {

        int low = 0;
        int high = array.length - 1;
        
        while (target >= array[low] && target <= array[high] && low <= high) {
            
            int probe = low + (high - low) * (target - array[low]) /
                        (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if (array[probe] == target) {
                return probe;
            }
            else if(array[probe] < target){
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }
        }

        return -1;
    }

}
