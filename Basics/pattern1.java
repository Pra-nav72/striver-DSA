public class pattern1{
    public static void main(String[] args) {
        Solution solution = new Solution();
        // solution.pattern1(5);
        // solution.pattern2(5);
        solution.pattern3(5);
    }
}
class Solution {
    public void pattern1(int n) {
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

     public void pattern3(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    




}