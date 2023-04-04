class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        if (arr.length % 2 != 0) {
            int mid = arr.length / 2;
            return arr[mid];
        } else {
            int mid1 = (arr.length / 2 )- 1;
            int mid2 = arr.length / 2;
            result = (arr[mid1] + arr[mid2]) * 1.0 / 2;
            return result;
        }
    }
}
