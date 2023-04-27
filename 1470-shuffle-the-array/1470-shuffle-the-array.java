class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int k = 0;
        int i = 0;
        int j = n;
        while(k < 2 * n) {
            result[k] = nums[i];
            k++;
            i++;
            result[k] = nums[j];
            k++;
            j++;
        }
        return result;
    }
}