class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int start = 0; //l left side of sliding window
        for (int i = 0; i < nums.length; i++) {  //r right side of sliding window
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            start = i - k;
            if (start >= 0) {
                set.remove(nums[start]);
            }
        }
        return false;
    }
}
