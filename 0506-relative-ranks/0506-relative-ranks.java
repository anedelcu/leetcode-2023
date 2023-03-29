class Solution {

    public String[] findRelativeRanks(int[] score) {
        
        String[] result = new String[score.length];
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        int n = score.length;
        Map<Integer, Integer> ranks = new HashMap<>();
        for(int i = 0; i < sortedScore.length; i++) {
            ranks.put(sortedScore[i], n - i);
        }
        for (int i = 0; i < score.length; i++) {
            
            int rank  = ranks.get(score[i]);
            if (rank == 1) {
                result[i] = "Gold Medal";
            } else if (rank == 2) {
                result[i] = "Silver Medal";
            } else if (rank == 3) {
                result[i] = "Bronze Medal";
            } else {
                
                result[i] = String.valueOf(rank);
            }
        }

        return result;
    }
 
}
