

public class ReverseNum {
    public static void main(String[] args) {
        int num = 7343;
        int reverseNum = 0;
        while (num > 0) {
            int x = num % 10;
            reverseNum = (reverseNum * 10) + x;
            num /= 10;
        }
        System.out.println(reverseNum);
    }
}
