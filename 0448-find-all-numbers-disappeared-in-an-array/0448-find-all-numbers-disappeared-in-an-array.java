class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        for(int i = 0; i <nums.length; i++) {
            if(set.add(i + 1)) {
                result.add(i + 1);
            }
        }
        return result;
        
    }
}