import java.util.*;
public class bubbleSort{
    public static void main(String[] args){
        int[] arr = {-1,7,5,-32,6,15,0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for(int i = 0; i < arr.length; i++){
            // for each step, max item will come at the last respective index
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}