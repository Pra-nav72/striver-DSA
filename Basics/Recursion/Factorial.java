public class Factorial {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = sol.factorial(5);
        System.out.println(x);
    }
}
class Solution {
    public int factorial(int n) {
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }
}