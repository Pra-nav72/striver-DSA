public class Fibonacci {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = sol.fib(3);
        System.out.println(x);
    }
}
class Solution {
    public int fib(int n) {
        //your code goes here
        if(n==1){
            return 1;
        }
        else if(n<=0){
            return 0;
        }
        return fib(n-1) + fib(n-2);
    }
}