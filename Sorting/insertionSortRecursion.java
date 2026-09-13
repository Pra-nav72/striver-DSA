import java.util.Arrays;

public class insertionSortRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 78,5, 12, 1};
        SortingInsertion sort = new  SortingInsertion();
        int[] x = sort.insertionSort(arr);
        System.out.println(Arrays.toString(x));
    }
}

class SortingInsertion{
    public int[] insertionSort(int[] arr){
        insertRecursive(arr, arr.length, 1);
        return arr;
    }

    private void insertRecursive(int[] arr, int n, int index){
        if (index>=n) {
            return;
        }
        int j = index;
        while (j>0 && arr[j-1] > arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertRecursive(arr, n, index+1);
    }
}

