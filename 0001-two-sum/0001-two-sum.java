class Solution {

    public int[] twoSum(int[] nums, int target) {
        // create a hashmap
        // iterate through the array of nums
        //  check is the map contains the key of (target - num)
        // if yes we have an answer - else we add the num to the map
        
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
