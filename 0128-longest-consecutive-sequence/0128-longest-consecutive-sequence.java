class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int  maxSeq = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        for(int n : nums) {
            if(!set.contains(n - 1)){
                int seq = 0;
                while(set.contains(n + seq)) {
                    seq++;
                }
                maxSeq = Math.max(seq, maxSeq);
            }
            if(maxSeq > nums.length/2) {
                break;
            }
        }
        return maxSeq;
    }
}