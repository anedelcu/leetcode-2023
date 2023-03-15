import java.util.HashMap;

public class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        for (int num : freq.keySet()) {
            if (k == 0 && freq.get(num) > 1) {
                // If k is 0, we only count pairs where the number appears at least twice
                count++;
            } else if (k > 0 && freq.containsKey(num + k)) {
                // If k is positive, we count pairs (num, num + k)
                count++;
            }
        }
        
        return count;
    }
}
