// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// base cocept ceiling of number 

public class smallestLetter {
    public static void main(String[] args){
        char[] arr = ["c","f","j"];
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    } 
    // smallest number >= the target element 
    // return the index 
    

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;

        while (start <= end){
            // find the middle element 
            // int mid = (start + end)/2; 
            // might be possible that (start + end) exceeds java int limit 

            int mid = start + (end - start) / 2;

            if  (target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}

    