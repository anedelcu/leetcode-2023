class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp = 0, size = nums.length;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) {
                        temp++;
                    }
                }
            }
            result[i] = temp;
            temp = 0;
        }

        return result;
    }
}
