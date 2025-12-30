public class LinearSearchINrange{
    public static void main(String[] args){
        int[] arr1 = {0, -1, 3, 94, 12, 14, 67, 99};
        int target = 12;
        System.out.println(searchInRange(arr1, target));
    }

    static int searchInRange(int[] arr, int target){
        if (arr.length == 0){
            return 0;
        }

        for (int i = 2; i <= 5; i++){
            int element = arr[i];
            if (target == element){
                return i;
            }
        }

        return 0;
    }
}