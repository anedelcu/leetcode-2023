class Solution {

    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        // Binary search for the first index i such that arr[i] - i - 1 >= k
        while (left <= right) {
            int mid = (left + right) / 2;
            int missingCount = arr[mid] - mid - 1;
            if (missingCount >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Compute the kth missing integer
        return left + k;
    }
}
