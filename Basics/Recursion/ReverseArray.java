import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        sol.reverse(arr , 5);
    }
}
class Solution {
    public void reverse(int[] arr, int n) {
        if(n<=arr.length/2){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[arr.length - n];
        arr[arr.length - n] = arr[n-1] ;
        arr[n-1] = temp;
        reverse(arr, n-1);
    }
}


