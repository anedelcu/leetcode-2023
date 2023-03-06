class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 1) {
            
            result.add(String.valueOf(nums[0]));
            return result;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int left = nums[i];
            String s = "";
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            int right = nums[i];
            if (left != right) {
                s = left + "->" + right;
            }
            else {
                s += left;
            }

            result.add(s);
            System.out.println("i = " + i);
            if(i == nums.length - 2) {
                result.add(String.valueOf(nums[i + 1]));
            }
        }
        return result;
    }
}
