class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        
        boolean match1 = false;
        boolean match2 = false;
        boolean match3 = false;
        for(int[] triplet : triplets) {
            if(triplet[0] > target[0] || triplet[1] > target[1] || triplet[2] > target[2]) {
                continue;
            }
            else {
                if(triplet[0] == target[0]) {
                    match1 = true;
                }
                if(triplet[1] == target[1]) {
                    match2 = true;
                }
                if(triplet[2] == target[2]) {
                    match3 = true;
                }
                
            }
            if(match1 && match2 && match3 ) {
                return true;
            }
        }
        return false;
        
    }
}