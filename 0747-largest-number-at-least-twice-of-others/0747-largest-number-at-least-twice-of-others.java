class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxIndex = -1;
        int max2Index = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max2 = max;
                max = nums[i];
                max2Index = maxIndex;
                maxIndex = i;
            }
            else if(nums[i] > max2) {
                max2 = nums[i];
                max2Index = i;
            }
        }
        System.out.println("max = " + max);
        System.out.println("max2 = " + max2);
        System.out.println("max2Index = " + max2Index);
        if(max >= (max2 + max2)) {
            return maxIndex;
        }
        return -1;
        
    }
}