class Solution {

    public String[] findRelativeRanks(int[] score) {
        
        String[] result = new String[score.length];
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        int n = score.length;
        for (int i = 0; i < score.length; i++) {
            int rank  = n - Arrays.binarySearch(sortedScore, score[i]);
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
