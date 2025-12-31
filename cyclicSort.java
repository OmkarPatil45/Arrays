import java.util.*;

public class cyclicSort{
    public static void main (String[] args){
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort (int[] arr){
        int i = 0;
        while (i < arr.length){
            // correct position of an element in sorted array 
            // is given by arr[i] - 1
            int correctPos = arr[i] - 1;
            if (arr[i] != arr[correctPos]){
                // swap arr[i] and arr[correctPos]
                int temp = arr[i];
                arr[i] = arr[correctPos];
                arr[correctPos] = temp;
            } else {
                i++;
            }
        }
    }
}

// Output:
// [1, 2, 3, 4, 5]