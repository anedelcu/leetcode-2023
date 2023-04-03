public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n)) {
                res[0] = n;
            }
            set.add(n);
        }
        int sum  = 0;
        for(int n : set) {
            sum += n;
        }
        int n = set.size() + 1;
        int missing = n * (n + 1) / 2 - sum;
        res[1] = missing;
        return res;
    }
}