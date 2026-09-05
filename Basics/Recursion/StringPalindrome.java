public class StringPalindrome {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String name = "hnnaannh";
        boolean check = sol.palindromeCheck(name);
        System.out.println(check);
    }
}
class Solution {
    public boolean palindromeCheck(String s) {
        return check(s, 0, s.length() - 1);
    }

    private boolean check(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return check(s, left + 1, right - 1);
    }
}
