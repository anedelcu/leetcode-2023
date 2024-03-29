class Solution {

    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for (int n : nums) {
            if (n == 0) {
                red++;
            } else if (n == 1) {
                white++;
            } else {
                blue++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < red) {
                nums[i] = 0;
            } else if (i >= red && i < white + red) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
