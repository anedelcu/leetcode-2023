class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // easiest way is to create a set HashSet at compare the length of the array with size of the set
        // improved version is this
        Set<Integer> set = new HashSet<>();
        for(int n :nums) {
            if(!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}