
import java.util.*;


public class ArrayHashMap {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 1, 2, 2, 1, 3, };
        List<List<Integer>> ans = sol.countFrequencies(arr);
        System.out.println(ans);
    }
}

class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(List.of(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}
