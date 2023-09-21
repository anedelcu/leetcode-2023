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
            int num = n;
            if(set.contains(num - 1)){
               continue; 
            }
            else {
                int seq = 1;
                while(set.contains(num + 1)) {
                    seq++;
                    num++;
                }
                maxSeq = Math.max(seq, maxSeq);
            }
            
        }
        return maxSeq;
    }
}