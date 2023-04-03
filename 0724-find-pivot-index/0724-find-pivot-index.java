class Solution {

    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            
            System.out.println("Sum1 = " + sum1);
            System.out.println("Sum2 = " + sum2);
            if(sum1 == sum2 - nums[i]) {
                return i;
            }
            sum2 -= nums[i];
            sum1 +=nums[i];
        }
        return -1;
    }
}
