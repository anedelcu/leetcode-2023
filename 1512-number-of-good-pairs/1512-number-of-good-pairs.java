class Solution {
    public int numIdenticalPairs(int[] nums) {
        if(nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        int i = 0;
        while(i < nums.length - 1) {
            int count = 1;
            while(i < nums.length - 1 && nums[i] == nums[i + 1]) {
                count ++;
                i++;
            }
            res += (count * (count - 1)) / 2;
            i++;
        }
        return res;
    }
}