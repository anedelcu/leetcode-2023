class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        
        Map<Long, Integer> map = new HashMap<>();
        int count = 0;
        int n = nums1.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                long sum = (long) nums1[i] + nums2[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                long sum = (long) nums3[i] + nums4[j];
                count += map.getOrDefault(-sum, 0);
            }
        }
        return count;
    }
}