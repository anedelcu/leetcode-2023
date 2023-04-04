class Solution {

    public int[] twoSum(int[] nums, int target) {
        
        // build a map val -index
        // iterate nums array
        // check if map.containsKey target - nums[i] and return the result if YES
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
