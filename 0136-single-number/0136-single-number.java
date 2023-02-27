class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length; i++) {
            n = n ^ nums[i];
            System.out.println(n + " and " + nums[i] + " = " + n);
        }
        return n;
    }
}