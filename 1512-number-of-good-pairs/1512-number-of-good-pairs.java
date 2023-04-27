class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int val : map.values()) {
            res += (val * (val - 1)) / 2;
        }
        
        return res;
    }
}