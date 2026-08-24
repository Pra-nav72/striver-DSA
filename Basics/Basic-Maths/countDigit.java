
public class countDigit {
    public static void main(String[] args) {
        int count = (int) Math.log10(2345) + 1;
        // log10(number) it will always return the x.abc, 
        // where x is number of digit - 1, that's why we add +1 at the end.
        System.out.println(count);
    }
}
