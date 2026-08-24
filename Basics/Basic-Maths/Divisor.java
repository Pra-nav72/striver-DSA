// find all the divisor of the given number

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Divisor {
    public static void main(String[] args) {
        int num = 36;
        List <Integer> divisor = new ArrayList<>(Arrays.asList());
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                divisor.add(i);
                if ((num / i) != i) {
                    divisor.add(num/i);
                }
                
            }
        }
        divisor.sort(Comparator.naturalOrder());
        System.out.println(divisor);
    }
}
