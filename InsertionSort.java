import java.util.*;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5,2,8,12,1,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        // i should go till n-2 to avoid ArrayIndexOutOfBounds
        for (int i = 0; i < arr.length -1; i++){
            // j-- because we are comparing with previous elements
            for (int j = i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }

        }
    }
}