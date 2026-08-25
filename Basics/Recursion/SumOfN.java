public class SumOfN {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = sol.NnumbersSum(10);
        System.out.println(x);
    }
}
class Solution {
    public int NnumbersSum(int N) {
        //your code goes here
        if(N<=1){
            return N;
        }
        return N + NnumbersSum(N-1);
    }
}
