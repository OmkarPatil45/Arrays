public class FindMin{
    public static void main(String[] args){
        int[] arr = { 90, 23, 45, 18, 63, 93};
        System.out.println(Min(arr));
    }

    // assume arr.length! = 0
    //  return the minimum value in the array 
    static int Min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i< arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

    return ans;
    }
}