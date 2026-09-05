
import java.util.Scanner;

public class ArrayHashing {
    public static void main(String[] args) {
        Scanner inp = new  Scanner(System.in);

        System.out.println("array length: ");
        int n = inp.nextInt();

        // creating an array
        int[] arr = new int[n];

        // array created
        System.out.println("Enter array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        // pre-computing: hashing
        int[] hash = new int[13]; // means the max element in arr is 12
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;     // increment element of hash where its index==array element
        }

        // return the number of counts.
        int q;
        q = inp.nextInt();
        while (q-- != 0) {
            int number;
            number = inp.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
        inp.close();

    }
}
