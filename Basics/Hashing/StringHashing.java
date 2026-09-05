import java.util.Arrays;
import java.util.Scanner;

public class StringHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String name = sc.next();

        // create hash array whose length should be 27
        int[] hash = new int[26];
        for (int i = 0; i < name.length(); i++) {
            hash[name.charAt(i)- 'a']++;
        }

        //questions
        int q;
        System.out.println("enter no. of characters to check occurance:");
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println( c + ": "+hash[c - 'a']);
        }
    }
}
