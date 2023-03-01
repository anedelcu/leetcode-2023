class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        // find the element with frequency greater than n/2
        for (int num : nums) {
            if (map.get(num) > nums.length/2) {
                return num;
            }
        }
        
        // this should never be reached since majority element is guaranteed to exist
        return -1;
    }
}