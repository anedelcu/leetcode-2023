public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double avg = 0.0;
        int n = nums.length;
        for(int i = 0; i < k && i < n; i++) {
            sum += nums[i];
        }
        avg = k <= n ? sum * 1.0 / k : sum * 1.0 / n;
        for(int i = k; i < n; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            avg = Math.max(avg, sum * 1.0 / k);
        }
        return avg;
    }
}