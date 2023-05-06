class Solution {
    /*
    Brute force
    iterate through array and check every posible pair
    i
    
    */
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(num - k)) {
                count += map.get(num - k);
            }
            if(map.containsKey(num + k)) {
                count += map.get(num + k);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
            
        }
        return count;
    }
}