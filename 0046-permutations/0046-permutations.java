class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, new ArrayList<>(), result);
        return result;
    }
    
    private void permuteHelper(int[] nums, List<Integer> permutation, List<List<Integer>> result) {
        // If the current permuatation has the same length as nums, add it to the result list
        if(permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }
        // Loop through all integers in nums that have not been used in the current permutation
        for(int i = 0; i < nums.length; i++) {
            if(!permutation.contains(nums[i])) {
                // add the integer to the current permuation
                permutation.add(nums[i]);
                // Recursively generate all permuations that can be made from the current permuation
                permuteHelper(nums, permutation, result);
                // Remove the added integer so that we can try adding unused integer
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}
