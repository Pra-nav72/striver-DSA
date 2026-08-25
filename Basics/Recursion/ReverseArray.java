public class ReverseArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        sol.reverse(arr , 5);
    }
}
class Solution {
    public void reverse(int[] arr, int n) {
        
        if(n==1){
            arr[n-1] = arr[arr.length-1];
            System.out.println(arr[n-1]);
            return;
        }
        System.out.println(arr[n-1]);
        reverse(arr, n-1);
    }
}
