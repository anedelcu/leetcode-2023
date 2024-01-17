class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length + nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }
        for(int i = nums.length; i < res.length; i++) {
            res[i] = nums[i - nums.length];
        }
        return res;
    }
}