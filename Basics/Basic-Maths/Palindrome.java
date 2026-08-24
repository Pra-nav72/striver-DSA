
public class Palindrome {
    public static void main(String[] args) {
        int num = 123421;
        int xnum = num;

        int reverseNum = 0;
        while (num > 0) {
            int x = num % 10;
            reverseNum = (reverseNum * 10) + x;
            num /= 10;
        }
        if(xnum == reverseNum){
            System.out.println("it is palindrome");
        }
        else{
            System.out.print("it is not a palindrome");
        }
    }
}
