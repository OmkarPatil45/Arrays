import java.util.*;

public class max{
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 81, 45};
        System.out.println(maxRange(arr, 0, 3));

    }

    // imagine that arr is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for(int i = start; i<end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}