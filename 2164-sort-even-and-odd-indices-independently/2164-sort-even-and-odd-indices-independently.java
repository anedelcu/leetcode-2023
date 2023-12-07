class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                evens.add(nums[i]);
            }
            else {
                odds.add(nums[i]);
            }
        }
        
        Collections.sort(evens);
        Collections.sort(odds, Collections.reverseOrder());
        int oddIdx = 0;
        int evenIdx = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i % 2== 0) {
                nums[i] = evens.get(evenIdx);
                evenIdx++;
            }
            else {
                nums[i] = odds.get(oddIdx);
                oddIdx++;
            }
        }
        return nums;
    }
}