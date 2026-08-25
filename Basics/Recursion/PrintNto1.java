
class Solution {
    public void printNumbers(int n) {
        // Your code goes here
        if(n<=1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}
public class PrintNto1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.printNumbers(5);
    }
}