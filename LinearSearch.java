import java.util.*;

public class LinearSearch{
    public static void main(String[] args){
        int[] nums = {-1, -3, 90, 87, -23, 32, 51};
        int target = 900;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);
        
    }

    // search in the array: return the indx if found
    // otherwise if item not found return -1
    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run for loop 
        for (int index = 0; index < arr.length; index++){
            // check for index at every index if its = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;


    }
}