class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        if(n<=1){
            System.out.println(1);
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }
}
public class Print1toN {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.printNumbers(5);
    }
}