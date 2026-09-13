import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 78,5, 12, 1};
        Sorting sort = new  Sorting();
        int[] x = sort.bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(x));
    }
}

class Sorting{
    public int[] bubbleSort(int[] arr, int n){  
        if (n==1) {
            return arr;
        }
        for (int j = 0; j < n-1; j++) {
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        

        return bubbleSort(arr, n-1);
    }
}
