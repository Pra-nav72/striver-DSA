import java.util.Arrays;
import java.util.Random;

public class Sorting3 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 78,5, 12, 1};
        SolutionQuickSort sort = new  SolutionQuickSort();
        int[] x = sort.quickSort(arr);
        System.out.println(Arrays.toString(x)); 
    }
}
class SolutionQuickSort {
    public int[] quickSort(int[] nums) {
        randomizedQuickSort(nums, 0, nums.length-1);
        return nums;
    }
    private void randomizedQuickSort(int[] arr, int low, int high){
        if (low < high){
            int p = randomizedPartition(arr, low, high);
            randomizedQuickSort(arr, low, p-1);
            randomizedQuickSort(arr, p+1, high);
        }
    }
    private int randomizedPartition(int[] arr, int low, int high){
        Random random = new Random();
        int r = random.nextInt(high+1);

        int temp = arr[r];
        arr[r] = arr[high];
        arr[high] = temp;

        int pivot = arr[high];
        
        
    }
}
