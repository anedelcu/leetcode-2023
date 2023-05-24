class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < nums[0].length; i++) {
            map.put(nums[0][i], 1);
        }
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                if(map.containsKey(nums[i][j])) {
                    map.put(nums[i][j], map.getOrDefault(nums[i][j], 0) + 1);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == n) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result);
        return result;
        
    }
}