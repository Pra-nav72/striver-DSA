
import java.util.*;

public class HighestOccurance {
     public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 1, 2, 2, 1, 1, 3, };
        int ans = sol.mostFrequentElement(arr);
        System.out.println(ans);
    }
}

class Solution {
    public int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int value = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(value < entry.getValue()){
                value = entry.getValue();
                key = entry.getKey();
            }
        }

        return key;
    }
}



