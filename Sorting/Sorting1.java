import java.util.Arrays;

//selection sort
//bubble sort
// insertion sort

public class Sorting1 {
    public static void main(String[] args) {
        int[] arr = {1, 12,67,23,2,43,3,1};

        Sorting sort = new Sorting();
        // int[] x = sort.selectionSort(arr);
        // int[] x = sort.bubbleSort(arr);
        int[] x = sort.insertionSort(arr);
        System.out.println(Arrays.toString(x));
    }
}
class Sorting{

    // selection Sort
    public int[] selectionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    // Bubble Sort
    public int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // optimization
            int didSwap = 0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap++;
                }
            }
            // swapping did not happened means array is already sort, no need further itrn
            if (didSwap==0) {
                break;
            }
        }
        return arr;
    }

    // insertion sort
    public int[] insertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}
