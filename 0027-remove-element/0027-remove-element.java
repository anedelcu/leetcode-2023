class Solution {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (j < nums.length) {
            while (j < nums.length && nums[j] == val) {
                j++;
            }
            if(j < nums.length) {
                nums[i] = nums[j];
            i++;
            j++;
            k++;
            }
            
        }
        return k;
    }
}
