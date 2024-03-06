class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        int rows = wall.size();
        Map<Integer, Integer> gaps = new HashMap<>();
        
        for(List<Integer> bricks : wall) {
            int gap = 0;
            for(int i = 0; i < bricks.size() - 1; i++) {
                gap += bricks.get(i);
                gaps.put(gap, gaps.getOrDefault(gap, 0) + 1);
            }
        }
        
        int maxGaps = 0;
        for(int gap : gaps.values()) {
            maxGaps = Math.max(maxGaps, gap);
        }
        return rows - maxGaps;
    }
}