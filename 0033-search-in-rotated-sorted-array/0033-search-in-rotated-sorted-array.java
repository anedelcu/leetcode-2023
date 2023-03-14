class Solution {

    public int search(int[] nums, int target) {
        int pivot = findIndex(0, nums.length - 1, nums);
        System.out.println("pivot: " + pivot);
        if(binarySearch(0, pivot - 1, target, nums) != -1) {
            return binarySearch(0, pivot - 1, target, nums);
        }
        return binarySearch(pivot, nums.length - 1, target, nums);
    }

    private int binarySearch(int low, int high, int target,  int[] arr) {
        
        int mid = (low+high)/2;

        if(low > high) {
            return -1;
        }

        if(arr[mid] == target) {
            return mid;
        }

        if(target<arr[mid]) {
            return binarySearch(low,mid-1,target,arr);
        }
        else {
            return binarySearch(mid+1,high,target,arr);
        }
    }

    private int findIndex(int left, int right, int[] nums) {
        if (nums[left] <= nums[right]) {
            return 0;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid + 1;
            } else if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
