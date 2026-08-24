// find the GCD/HCF(greates common divisor): use Euclidean Algorithm
// :: gcd(a, b) == gcd(a-b, b) ---> where a > b;
public class GCD {
    public static void main(String[] args) {
        int a = 16;
        int b = 20;

        int x = a>b ? a-b : b-a;

        int gcd = 1; // all the number have atleast 1 as gcd.
        for (int i = Math.min(a, b); i >= 1; i--) {
            if (x%i == 0 && b%i==0) {
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);


        // using euclidean algorithm,  time-complexity: O (logΦ(min(a, b))); Φ:phi
        gcd = EuclideanAlgo(a, b);
        System.out.println("using euclidean Algorithm: "+ gcd);
    }

    public static int EuclideanAlgo(int a, int b){
        while (a > 0 && b>0) {
            if (a>b) {
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}

