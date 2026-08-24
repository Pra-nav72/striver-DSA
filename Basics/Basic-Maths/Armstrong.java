// 12 = (1 * 1) + (2 * 2)
// 123 = (1 * 1 * 1) + (2 * 2 * 2) + (3 * 3 * 3)
// power depends on the number of digits
public class Armstrong {
    public static void main(String[] args) {
        int num = 1634;
        int xnum = num;
        int sum = 0;
        int count = (int) Math.log10(num) + 1; // find number of digits

        while (num > 0) {
            int x = num % 10;
            sum = sum + (int)Math.pow(x, count);
            num /= 10;
        }

        if (xnum == sum) {
            System.out.println("armstrong number: "+ xnum);
        }
        else{
            System.out.println(xnum+" is not an armstrong number!");
        }
    }
}
